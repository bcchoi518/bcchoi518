// 진법 변환 실습-2 (부호가 없는 상수와 long형 상수를 출력하는 예제)

//#include <stdio.h>
//
//int main(void) {
//
//	unsigned int un_num = 12345U;		// 부호가 없는 10진수 상수값을 대입
//	long lg_num = 1234567890L;			// 접미사 L을 붙여서 long형 10진수 상수값을 대입
//
//	printf("부호가 없는 상수값을 10진수로 출력 : %u \n", un_num);
//	printf("long형 상수값을 10진수로 출력 : %d \n", lg_num);
//	printf("long형 상수값을 10진수로 출력 : %ld \n", lg_num);
//	printf("------------------------------------------------------\n");
//	printf("부호가 없는 상수값을 8진수로 출력 : %#o \n", un_num);
//	printf("long형 상수값을 8진수로 출력 : %#o \n", lg_num);
//	printf("------------------------------------------------------\n");
//	printf("부호가 없는 상수값을 16진수로 출력 : %#x \n", un_num);
//	printf("long형 상수값을 16진수로 출력 : %#x \n", lg_num);
//
//
//	return 0;
//}