// 진법 변환 실습-3 (사용자로부터 10진수를 입력 받고 8, 10, 16진수로 표식을 하는 예제)

//#include <stdio.h>

//int main(void) {
//
//	int input_num = 0;		
//	
//	printf("10진수 입력 : ");
//	scanf_s("%d", &input_num);
//
//	// 출력형식 지정자에 의해서 자동으로 8진수, 16진수로 변환되어 출력된다.
//	printf("10진수로 출력 : %d \n", input_num);
//	printf(" 8진수로 출력 : %#o \n", input_num);
//	printf("16진수로 출력 : %#x \n", input_num);
//
//	// C언어에서 지원하는 아스키코드값은 0 ~ 127까지 이므로 128부터는 ?가 출력이 되는것을 볼 수가 있다.
//	printf("입력한 정수에 해당하는 문자 : %c \n", input_num);
//
//	return 0;
//}