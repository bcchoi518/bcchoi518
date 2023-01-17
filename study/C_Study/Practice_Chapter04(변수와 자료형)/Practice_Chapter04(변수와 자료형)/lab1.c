// 문제1
// 사용자로부터 초를 입력받아서 시간, 분, 초로 변환하는 프로그램을 작성하시오.
// #define SECS_PER_MIN 60     <-- 기호 상수를 이용한다. (분)
// #define SECS_PER_HOUR 3600  <-- 기호 상수를 이용한다. (시간)
// 
// 실행결과
// 초를 입력해주세요 : 3600
// 1hours, 0minutes, 0seconds
// 계속하려면 아무 키나 누르십시요....
//----------------------------------------------------------------------------------

//#include <stdio.h>
//#define SECS_PER_MIN 60
//#define SECS_PER_HOUR 3600
//
//int main(void) {
//
//	int hour = 0, min_in = 0, min_out = 0, sec_in = 0, sec_out = 0;
//
//	printf("초를 입력해주세요 : ");
//	scanf_s("%d", &sec_in);
//
//	hour = sec_in / SECS_PER_HOUR;
//	printf("hours = %d \n", hour);
//	min_in = sec_in / SECS_PER_MIN;
//	printf("min_in = %d \n", min_in);
//	min_out = min_in % SECS_PER_MIN;
//	printf("min_out = %d \n", min_out);
//	sec_out = sec_in % SECS_PER_MIN;
//	printf("sec_out = %d \n", sec_out);
//
//	printf("%d hours, %d minutes, %d seconds \n", hour, min_out, sec_out);
//
//
//	return 0;
//}