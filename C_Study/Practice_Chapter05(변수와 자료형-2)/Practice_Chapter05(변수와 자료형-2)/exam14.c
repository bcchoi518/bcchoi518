// 기호 상수에 대한 실습-2
// 2번째 방법 : const 키워드를 이용하여 상수를 정의한다. 메인함수 안에서 선언을 해줘야 한다.
// const라는 의미가 프로그램이 종료가 될 때까지 불변의 값을 지니는 것이다. 자료형을 다양하게 선언할 수 있고, #define에 비해서 메모리를 할당을 한다.

//#include <stdio.h>
//
//int main(void) {
//
//	// 사용자로부터 평수를 입력받아서 평방미터(㎡)로 환산하는 프로그램을 작성
//	const float M = 3.305785;		// cconst 키워드로 상수를 선언 후 초기화
//	//M = 1.1;						// const로 정의된 상수값은 절대 변경이 안된다.
//	float flat = 0.0, area = 0.0;
//
//	printf("기호상수 M : 3.305785\n");
//	printf("평방미터(㎡) = 평수 * 3.305785\n");
//	
//	// 사용자로부터 평수 입력
//	printf("평수를 입력해주세요. : ");
//	scanf_s("%f", &flat);
//
//	area = flat * M;
//
//	printf("입력한 평수는 %.3f이고 평방미터로 환산하면 %.3f㎡입니다.\n", flat, area);
//
//	return 0;
//}