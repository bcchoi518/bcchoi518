//// 표준 입력 함수 : scanf_s() 함수에 대한 실습
//// 정수 1개를 입력 받아서 출력하는 프로그램을 실습
//#include <stdio.h>
//#include <stdlib.h>
//int main(void) {
//	system("title 정수 2개를 입력받아서 덧셈 연산 프로그램");
//	// 변수 선언 및 초기화
//	int num1 = 0, num2 = 0, sum = 0;
//	float num3 = 0.0, num4 = 0.0, sum_f = 0.0;
//	// 정수입력
//	printf("1번째 정수 입력 :");
//	scanf_s("%d", &num1);
//	printf("2번째 정수 입력 :");
//	scanf_s("%d", &num2);
//	// 실수입력
//	printf("1번째 실수 입력 :");
//	scanf_s("%f", &num3);
//	printf("2번째 실수 입력 :");
//	scanf_s("%f", &num4);
//	// 덧셈 연산
//	// CPU(중앙 처리 장치)는 0,1의 2진수와 가산(더하기) 기능밖에 하지 못한다.
//	// num1, num2 값을 2진수로 변환시켜서 가산을 한다. 그리고 그 결과를 10진수로 변경하여 출력해준다.
//	sum = num1 + num2;
//	printf("정수 덧셈 결과 : %d + %d = %d\n", num1, num2, sum);
//	sum_f = num3 + num4;
//	printf("실수 덧셈 결과 : %.1f + %.1f = %.1f\n", num3, num4, sum_f);
//	return 0;
//}