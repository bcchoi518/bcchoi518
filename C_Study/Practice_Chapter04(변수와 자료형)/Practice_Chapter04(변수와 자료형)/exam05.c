//// 언더플로우(unerflow) : 변수에 선언한 자료형이 정상적으로 처리하는 유효범위의 최소값보다 더 작은 값이 대입되었을때, 오히려 유효범위의 최대값과 연산해서 엉뚱한 결과값을 출력하는 것이 언더플로우이다.
////
//#include <stdio.h>
//int main(void) {
//	unsigned short num1 = 0, num2 = 0, result = 0;
//	
//	printf("unsigned short형 유효범위 : 0 ~ 65535 \n");
//	printf("1번째 정수 입력 : ");
//	// 형식 지정자 %hu는 unsigned short를 받기 위한 것이다.
//	// 만약에 형식 지정자를 %d로 사용할 경우에 값은 출력이 되나 스택영역 메모리에 정상적으로 활용되지 않고 있다라고 하는 에러 팝업이 뜬다.
//	scanf_s("%hu", &num1);
//	printf("2번째 정수 입력 : ");
//	scanf_s("%hu", &num2);
//	// 아래 연산식에서 음수값이 나오면 언더플로우가 발생을 한다.
//	result = num1 - num2;
//	printf("뺄셈 연산 : %hu - %hu = %hu \n", num1, num2, result);
//	
//	return 0;
//}