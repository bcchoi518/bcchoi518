#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <arpa/inet.h>	//socket 사용할때 인클루드 하는 헤더파일
#include <sys/types.h>	//socket 사용할때 인클루드 하는 헤더파일
#include <sys/socket.h>	//socket 사용할때 인클루드 하는 헤더파일
#include <netinet/in.h>	//socket 사용할때 인클루드 하는 헤더파일
#include <pthread.h>	//thread 사용할때 인클루드 하는 헤더파일

#define CLNT_MAX 10
#define BUFFSIZE 200

int g_clnt_socks[CLNT_MAX];	//클라이언트 소켓 선언
int g_clnt_count = 0;

pthread_mutex_t g_mutex;

void send_all_clnt(char * msg,int my_sock){

	pthread_mutex_lock(&g_mutex);
	for(int i = 0 ; i < g_clnt_count ; i++){

		if(g_clnt_socks[i] != my_sock){
			printf("send msg : %s", msg);
			write(g_clnt_socks[i], msg, strlen(msg) + 1);
		}//end if
	}//end for

	pthread_mutex_unlock(&g_mutex);

}//end send_all_clnt

void * clnt_connection(void * arg){

	int clnt_sock = (int)arg;
	int str_len = 0;

	char msg[BUFFSIZE];
	int i;

	while(1){
		str_len = read(clnt_sock, msg, sizeof(msg));
		if(str_len == -1){
			printf("clnt[%d] close\n", clnt_sock);
			break;
		}//end if
		send_all_clnt(msg, clnt_sock);
		printf("%s\n", msg);

	}//end while


	pthread_mutex_lock(&g_mutex);

	for(i = 0; i < g_clnt_count; i++){
		if(clnt_sock == g_clnt_socks[i]){
			for( ;i < g_clnt_count - 1; i++)
				g_clnt_socks[i] = g_clnt_socks[i + 1];
			break;
		}//end if
	}//end for

	pthread_mutex_lock(&g_mutex);
	close(clnt_sock);

	pthread_exit(0);
	return NULL;
}

int main(int argc, char ** argv){	//메인함수 시작

	int serv_sock;		//서버 소켓 선언(connection 받기 위한 소켓)
	int clnt_sock;		//클라이언트 소켓 선언(client와 패킷을 주고받는 소켓)

	pthread_t t_thread;	//pthread 타입의 변수 선언

	struct sockaddr_in clnt_addr;	//client 정보를 담을 구조체 선언
	int clnt_addr_size;	//client 정보가 담긴 구조체의 사이즈

	struct sockaddr_in serv_addr;	//bind 하기 위한 구조체 선언

	pthread_mutex_init(&g_mutex, NULL);

	//빈 소켓만들기(IPv4 사용, TCP통신을 의미, 프로토콜을 의미), SOCK_DGRAM : UDP통신, SOCK_RAW : RAW단 통신
	serv_sock = socket(PF_INET, SOCK_STREAM, 0);	// 0 : 자동으로 첫번째 두번째 매개변수를 기준으로 인자값 지정(==IPPROTO_HOPOPTS)

	//bind 하기 위한 구조체의 인자(bind할때 쓰는 정보)
	serv_addr.sin_family = AF_INET;	//PF_INET와 같음 (통상적으로 소켓에 PF, 어드레스에 AF 사용)
	//소켓 바인드할때 어떤 주소로 하는지 지정(INADDR_ANY : 현재 컴퓨터에서 사용하는 IP 사용)
	serv_addr.sin_addr.s_addr = htonl(INADDR_ANY);	//htonl : host order을 network order로 변경 (통신은 빅엔디안), long : 32bit 의미
	serv_addr.sin_port = htons(7989);	//port 지정 (htons : host order을 network order로 변경, short : 16bit 의미
	//bind 하기(빈 소켓, bind정보가 담긴 구조체 주소, 구조체의 사이즈)
	if(bind(serv_sock, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) == -1){	// bind 에러가 나면 -1 반환
		printf("bind error\n");
	}
	//listen 하기(지금까지 만든 서버소켓, accept 하기전 listen 대기 수), 5 : 최대 5명의 고객을 기다림
	if(listen(serv_sock, 5) == -1){	// listen 에러가 나면 -1 반환
		printf("listen error");
	}

	char buff[200];
	int recv_len =0;
	while(1){
		
		clnt_addr_size = sizeof(clnt_addr);
		//클라이언트 소켓 accept 하기(서버 소켓, client 정보가 담긴 구조체(통상적으로 IP가 담겨서 온다), 구조체의 사이즈)
		clnt_sock = accept(serv_sock, (struct sockaddr *)&clnt_addr, &clnt_addr_size);	//1명당 생성되는 소켓

		pthread_mutex_lock(&g_mutex);
		g_clnt_socks[g_clnt_count++] = clnt_sock;	//전역변수 client 소켓에 clnt_sock 저장
		pthread_mutex_unlock(&g_mutex);
		//다중 접속을 thread로 처리
		//thread 생성하기 (생성된 thread에 대한 정보, NULL(기본값), 쓰레드를 생성할 함수, 함수에 넘길 인자)
		pthread_create(&t_thread, NULL, clnt_connection, (void *)clnt_sock);
	}//end while

}//end main





