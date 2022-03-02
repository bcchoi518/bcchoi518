#include <stdio.h>  //stdio.h 파일을 exam01.c 파일에 포함시켜서 사용하겠다.
//main()은 프로그램의 시작점을 의미한다.
int main(void) {
	//printf() 함수는 표준(콘솔)출력함수를 의미한다.
	printf("안녕하세요. C언어 공부시작합니다.\n");
	
	long num1 = 2147483647;
	long num2 = -2147483648ll;

	num1 = num1 + 2;
	num2 = num2 - 2;

	printf("오버 플로우 : %d\n", num1);
	printf("언더 플로우 : %d\n", num2);

	return 0;

}