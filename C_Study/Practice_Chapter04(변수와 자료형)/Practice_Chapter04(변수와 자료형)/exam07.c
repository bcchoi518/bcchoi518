// 소수점 이하 값이 모두 0으로 출력되는 경우
// 정수끼리의 연산은 무조건 정수값이 나온다.(+, -, /, *, %, 등)
// 예를 들어 5를 3으로 나누면 1.66666666666........으로 출력이 되어야 정상이다.
// 정수끼리의 연산에서도 소수점 자리를 보이게끔 하려면 강제캐스팅 방법을 이용한다.
// (자료형) 변수명; <-- 강제 캐스팅 방법

//#include <stdio.h>
//int main(void) {
//
//	int num1 = 0, num2 = 0, temp = 0;
//	float result = 0.0;
//
//	printf("정수 2개를 입력해 주세요 \n");
//	printf("첫 번째 정수값 입력 : ");
//	scanf_s("%d", &num1);
//	printf("두 번째 정수값 입력 : ");
//	scanf_s("%d", &num2);
//
//	// 아래 코드는 정수끼리 먼저 나누기 연산을 진행한 후, 실수형 자료형인 result에 대입이 되는 코드이다.
//	/*result = num1 / num2;*/
//
//	// 아래 코드는 정수형 변수인 num1을 강제로 float 타입인 실수형으로 바꾸고 있다.
//	result = (float) num1 / num2;
//
//	/*temp = num1 / num2;*/
//
//	printf("나눗셈 연산 : num1 / num2 = %d / %d = %f \n", num1, num2, result);
//	
//	// 정수형 타입으로 연산을 진행하면 무조건 소수점 자리를 버린다.
//	/*printf("나눗셈 연산 : num1 / num2 = %d / %d = %d \n", num1, num2, temp);*/
//
//	return 0;
//}