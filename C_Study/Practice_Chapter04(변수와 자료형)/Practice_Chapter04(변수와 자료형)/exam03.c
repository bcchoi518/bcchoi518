//// 오버플로우(overflow) : 변수에 선언한 자료형(Data Type)이 정상적으로 처리하는 유효범위의 최댓값보다 더 큰 값이 대입이 되면
//// 오히려 유효범위의 최솟값과 연산하여 실행 결과가 출력이 되어 엉뚱한 값을 출력하는 것이 오버플로우 현상이다.
////
//#include <stdio.h>
//int main(void) {
//	// signed 는 부호가 있는 즉, 음수까지 포함하는 유효범위를 가진다.
//	// signed short의 유효범위 : -32768 ~ 0 ~ 32767
//	signed short num1 = 0;
//	signed int num2 = 0;
//	num1 = 32767;
//	num2 = 32767 + 5;
//
//	printf("signed short형 유효범위 : -32768 ~ 0 ~ 32767 \n");
//	printf("1. 변수 num1 :%7d \n", num1);
//	// num2는 유효범위를 5만큼 벗어났다 하여 유효범위의 최소값으로 가서 연산을 하여 결과값이 엉뚱하게 출력이 되었다. (마치 프로그래머가 의도한 것처럼 컴파일러가 에러를 잡아주지 않는다)
//	printf("2. 변수 num2 :%7d \n", num2);
//
//	// 결론은 오버프롤우가 발생이 되지 않게 하려면 프로그래머가 그 변수에 대입되는 값이 어느정도 되는지를 예상하고 적절한 자료형을 선언 해주는 것이 가장 좋은 방법이다.
//
//	return 0;
//}