//// 오버플로우 실습 - unsigned(부호가없는) 4바이트 정수형 변수 사용 실습
//// 
//#include <stdio.h>
//int main(void) {
//	// unsigned 키워드는 생략하면 안된다. 생략하면 signed로 인식된다.
//	unsigned int money = 0;
//
//	// 부호가 없는 int의 유효범위 : 0 ~ 4294987295
//	printf("unsigned int형의 유효범위 : 0 ~ 4294987295 \n");
//
//	printf("1. 보유 현금 입력 : ");
//	scanf_s("%d", &money);
//
//	printf("2. 입력한 현금 출력 : %d \n", money);
//
//
//
//	return 0;
//}