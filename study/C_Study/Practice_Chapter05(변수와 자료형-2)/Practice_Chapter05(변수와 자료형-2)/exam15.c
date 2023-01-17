// 기호 상수에 대한 실습-3
// #define과 const 키워드를 혼용한 예제

//#include <stdio.h>
//#define US 1129.50
//
//int main(void) {
//
//	const float FEES = 0.0175;		// 미화 현찰 구입시 수수료율
//	int cash = 0;
//	float dollar = 0.0, fees_cash = 0.0;
//
//	printf("환전할 금액(한화)을 입력해주세요. : ");
//	scanf_s("%d", &cash);
//
//	dollar = cash / US;				// 달러를 원화로 환전하는 계산식
//	fees_cash = cash * FEES;		// 환전할 때의 수수료 계산식
//
//	printf("환전 후 미화(dollar) 금액 : $ %.2f\n", dollar);
//	printf("환전 수수료 : \\ %.2f\n", fees_cash);
//
//	return 0;
//}