//// 표준 입력 함수 : scanf_s() 함수에 대한 실습
//// 정수 1개를 입력 받아서 출력하는 프로그램을 실습
//#include <stdio.h>
//#include <stdlib.h>
//int main(void) {
//	// 원래는 scanf()함수를 이용하여 사용자로부터 데이터를 입력을 받았다. 그러나 데이터 타입의 크기보다 더 많은 데이터를 입력하게 되면 프로그램이 멈추는 현상이 발생되어 보안에 굉장히 취약한 점이 발생되어 2013년도부터 MS사에서 SDL기능이 추가되어 scanf_s()함수 사용이 권장되고있다.
//	// 비주얼스튜디오 2019버전 이후는 SDL기능이 탑재되어 있기 때문에 scanf_s()를 사용하도록 한다.
//	system("title 정수 1개 입력 후 출력 프로그램");
//	// 모든 변수는 원래 초기화가 원칙이다.(중요)
//	int num = 0;
//	printf("정수 1개를 입력하세요 :");
//	// &(앰퍼센트)는 변수의 주소를 알려주는 주소 참조 연산자이다. 변수가 할당한 메모리의 주소를 알고 있어야 입력한 데이터를 저장할 수 있지 아니한가?
//	scanf_s("%d", &num);
//	printf("키보드로 입력받은 값은 %d 입니다.\n", num);
//	// 변수의 주소를 출력하고자 한다면 %d는 10진수로 출력을 해주고, %p는 16진수로 표식하므로 %p를 이용하도록 한다.
//	printf("변수 num의 메모리 주소값 : %p\n", &num);
//	return 0;
//}