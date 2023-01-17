// 문자열 상수에 대한 실습-2

//#include <stdio.h>
//
//int main(void) {
//
//	char arr[6] = "space";		// 문자열 상수값으로 저장된 상태	
//	char input_data[13] = "";	// input_data 문자형 배열을 선언 후 초기화
//	
//	printf("arr에 저장되어 있는 값 : %s\n", arr);
//	// 문자열을 입력시에는 공백이 존재해서는 안된다는 것이다. 만약 공백을 입력했다면 공백 이전까지의 값만 출력이 된다.
//	printf("문자열 입력 : ");
//	scanf_s("%s", input_data, sizeof(input_data));
//
//	printf("arr의 문자열 + 입력한 문자열 = %s%s\n", arr, input_data);
//
//	return 0;
//}