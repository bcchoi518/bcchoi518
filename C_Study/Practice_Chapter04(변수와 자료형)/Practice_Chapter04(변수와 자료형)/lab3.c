// 문제3
// 달러에 대한 환율을 입력받고, 원화금액도 입력을 받아서 원화가치를 달러로 표시하는 프로그램을 작성하시오.
// 변수명은 알아서 작성하시오
// 실행결과
// 달러에 대한 원화 환율을 입력하세요 : 1236
// 원화 금액을 입력하시오 : 10000
// 원화 10000원은 8.090615달러입니다.
// 계속하시려면 아무 키나 누르십시요.....
//--------------------------------------------------------------------

#include <stdio.h>
int main(void) {

	int krw = 0;
	float usd = 0.0, exc_rate = 0;

	printf("달러에 대한 원화 환율을 입력하세요 : ");
	scanf_s("%f", &exc_rate);
	printf("원화 금액을 입력하시오 : ");
	scanf_s("%d", &krw);

	usd = krw / exc_rate;

	printf("원화 %d원은 %f달러입니다. \n", krw, usd);

	return 0;
}