// 문자열 상수를 대한 실습-3
// 포인터(pointer)변수 : 포인터의 사전적 의미는 '무엇을 가리키는 것', 포인터 변수는 오직 주소만 가질수 있는 변수라고 생각을 하자.
// 포인터 변수를 선언할 대는 변수명 앞에 *(아스타리크)를 붙여서 선언을 한다.
// 문자열이 메모리의 임의의 공간에 생성되어진다면, 반드시 주소를 가지고 있다 하여 그 주소를 포인터 변수에 대입해서 문자열을 참조(간접참조)를 하여 처리를 하는 것이다.

//#include <stdio.h>
//
//int main(void) {
//	// 포인터 변수는 초기화 값으로 항상 NULL을 대입해주어야 문제가 발생하지 않는다.
//	char* ptr = NULL;
//	ptr = "안녕하세요";
//
//	printf("현재 ptr이 가리키고 있는 곳의 문자열 값 : %s\n", ptr);		// 포인터 변수를 통한 간접참조로 문자열
//	printf("임의의 메모리에 생성된 문자열의 주소값 : %p\n", ptr);		// 문자열의 주소값 출력
//	printf("포인터 변수 ptr을 위해 할당된 주소값 : %p\n", &ptr);		// ptr변수 자체의 메모리 주소값 출력
//	printf("포인터 변수 ptr의 바이트 수 : %u바이트\n", sizeof(ptr));	// 포인터 변수의 메모리 할당된 바이트수
//
//	printf("---------------------------------------------------------------\n");
//	// 포인터 변수도 변수의 일종이기 때문에 주소를 얼마든지 바꾸어 쓸 수가 있다.
//	// 포인터 변수도 저장된 문자열의 값은 공백도 하나의 문자열의 구성요소로 보기 때문에 공백에 연연하지 않는다.
//	ptr = "반갑습니다.";
//	printf("현재 ptr이 가리키고 있는 곳의 문자열 값 : %s\n", ptr);		
//	printf("임의의 메모리에 생성된 문자열의 주소값 : %p\n", ptr);		
//	printf("포인터 변수 ptr을 위해 할당된 주소값 : %p\n", &ptr);
//	printf("---------------------------------------------------------------\n");
//
//	// 포인터 변수는 어떤 자료형이 오더라도 8바이트 만큼만 컴파일러가 메모리를 할당해준다. (32비트는 4바이트)
//	// 포인터 변수는 같은 자료형에 해당하는 변수의 주소를 지닐 수 있다.
//	// iptr은 포인터 변수가 가지고 있는 주소값을 의미하는 것이고, *iptr은 포인터 변수가 참조하고 있는 공간의 값 자체를 의미한다.
//	int* iptr = NULL;
//	int num = 100;
//	iptr = &num;
//	printf("현재 ptr이 가리키고 있는 곳의 문자열 값 : %d\n", *iptr);
//	printf("임의의 메모리에 생성된 문자열의 주소값 : %p\n", iptr);
//	printf("포인터 변수 iptr을 위해 할당된 주소값 : %p\n", &iptr);
//	printf("포인터 변수 iptr의 바이트 수 : %u바이트\n", sizeof(iptr));
//
//	return 0;
//}