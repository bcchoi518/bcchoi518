#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <arpa/inet.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <pthread.h>

#define BUFFSIZE 100
#define NAMESIZE 20

void * rcv(void * arg){

	printf("rcv thread created\n");
	int sock = (int)arg;
	char buff[500];
	int len;
	while(1){
		len = read(sock, buff, sizeof(buff));

		if(len == -1){
			printf("sock close\n");
			break;
		}
		printf("%s",buff);
	}

	pthread_exit(0);
	return 0;
}



int main(int argc,char **argv){

	int sock;
	struct sockaddr_in serv_addr;
	pthread_t rcv_thread;
	void* thread_result;

	char id[100];
	printf("argc : %d\n", argc);
	if(argc < 2){
		printf("you have to enter ID\n");
		return 0;
	}
	strcpy(id, argv[1]);
	printf("id : %s\n", id);
	//빈 소켓 만들기(IPv4, TCP통신, IPPROTO_HOPOPTS)
	sock = socket(PF_INET, SOCK_STREAM, 0);
	if(sock == -1){
		printf("socket error");
	}else{

		printf("socket ok\n");
	}

	memset(&serv_addr, 0, sizeof(serv_addr));
	//어디에 접속 할 것인가
	serv_addr.sin_family = AF_INET; //IPv4 사용
	serv_addr.sin_addr.s_addr = inet_addr("127.0.0.1");	//로컬상에서 쓰는 주소(같은 PC상)
	serv_addr.sin_port = htons(7989);	//서버 포트 번호랑 동일
	//connect 하기
	if(connect(sock, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) == -1){
		printf("connect error\n");
	}
	else{

		printf("connection success\n");
	}
	//thread 생성 (생성된 tread에 대한 정보, NULL(기본값), 쓰레드를 생성할 함수, 함수에 넘길 인자)
	pthread_create(&rcv_thread, NULL, rcv, (void *)sock);

	char chat[100];
	char msg[1000];


	printf("while before\n"); 
	while(1) {
		printf("채팅 입력 : ");
		gets(chat);
		sprintf(msg,"[%s] : %s\n", id, chat);
		printf("send : %s", msg);
		write(sock, msg, strlen(msg) + 1);
		sleep(1);
	}

	printf("while end\n"); 
	close(sock);
	return 0;


}

