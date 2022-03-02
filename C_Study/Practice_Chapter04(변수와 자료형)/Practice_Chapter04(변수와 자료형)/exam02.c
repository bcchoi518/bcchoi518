//// 변수 초기화 : 변수를 선언하면서 초기값을 변수에 대입하는 과정을 변수 초기화라고 한다.
//// 변수라는 것은 자료형의 크기(바이트)만큼 메모리(스택)영역을 할당을 받는다.
//// 메모리를 할당받고 변수를 초기화를 하지 않는다면, 메모리 공간에는 가비지값(쓰레기값)이 저장되어 있다. 하여 변수의 초기화를 하는 습관을 반드시 들이도록 하자.
//// 정수형 변수 : 양의 정수, 음의 정수
//// 정수형 변수의 종류 : short(2byte), int(4byte), long(4byte), long long(8byte)
//// 각각의 정수형 변수에는 signed(부호가 있는), unsigned(부호가 없는)로 나뉜다. (0은 포함)
//// 정수형 자료형의 부호 : signed는 앞의 1비트는 부호비트(MSB)이며, 0이면 양수, 1이면 음수를 표식한다.
//// 1 byte의 유효범위는 signed는 -123 ~ 0 ~ 127 까지이고, unsigned는 0 ~ 255로 표식이 되어 둘다 256개의 유효범위를 지닌다.
//// 통상 signed 자료형을 많이 사용하지만, 음수값이 존재하지 않는 데이터를 받아 들인다면 unsigned 자료형 사용을 고려해볼만 하다.
////
//#include <stdio.h>
//// 전역변수는 초기화를 하지 않아도 기본값을 가진다.
//// int b;
//int main(void) {
//	// 함수 안에 선언된 변수(지역변수)는 기본적으로 초기화가 원칙이다. main()도 함수이므로 블럭안에 선언된 변수는 지역변수이기 때문에 초기화를 해야 한다.
//	// 모든 변수는 무조건 초기화를 시키도록 하자. 
//	int a = 0;
//	printf("a 변수의 값 : %d\n", a);
//	printf("-----------------------------------------------\n");
//	// 자료형(Data Type)의 크기(byte와 bit)를 표식하도록 해본다.
//	short num1 = 0;
//	int num2 = 0;
//	long num3 = 0;
//	long long num4 = 0;
//	// sizeof()를 이용하여 정수형 타입의 크기를 출력해보도록 하자.
//	printf("자료형의 크기를 구하는 함수 : sizeof() 함수\n");
//	printf("1.short의 byte수 : %d\n", (int)sizeof(num1));
//	printf("2.int의 byte수 : %d\n", (int)sizeof(num2));
//	printf("3.long의 byte수 : %d\n", (int)sizeof(num3));
//	printf("4.long long의 byte수 : %d\n", (int)sizeof(num4));
//	printf("-----------------------------------------------\n");
//	printf("1byte는 8bit로 구성됩니다.\n");
//	printf("1.short의 bit수 : %d\n", (int)sizeof(num1) * 8);
//	printf("2.int의 bit수 : %d\n", (int)sizeof(num2) * 8);
//	printf("3.long의 bit수 : %d\n", (int)sizeof(num3) * 8);
//	printf("4.long long의 bit수 : %d\n", (int)sizeof(num4) * 8);
//	printf("-----------------------------------------------\n");
//	return 0;
//}