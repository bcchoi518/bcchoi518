#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>

int a = 0;

pthread_mutex_t mutex;
// thread를 생성할때 사용되는 함수 선언
void * thread1(void * arg){
	
	printf("arg : %d\n", (int)arg);

	while(1) {


		pthread_mutex_lock(&mutex);
		printf("thread%d a[%d]\n", (int)arg, ++a);
		pthread_mutex_unlock(&mutex);
		sleep(2);
	}

	return NULL;
}

int main(){
	pthread_t s_thread[2];	//pthread 타입의 thread 변수(생성된 thread를 핸들링할 수 있는 변수)
	int id1 = 77;
	int id2 = 88;

	pthread_mutex_init(&mutex, NULL);
	//thread 생성(생성된 thread에 대한 정보, NULL(기본값), thread를 생성할 함수, 함수에 넘길 인자)
	pthread_create(&s_thread[0], NULL, thread1, (void *)id1);
	pthread_create(&s_thread[1], NULL, thread1, (void *)id2);

	while(1){
		
		printf(" main loop\n");
		sleep(1);
	}
	//thread를 기다림
//	pthread_join(s_thread[0], NULL);
//	pthread_join(s_thread[1], NULL);
}
