//// 문제1
//// 다음 내용에 맞는 프로그램을 작성하시오.
//// 조건
//// 국어, 영어, 수학 점수를 각각 키보드로 입력
//// 3과목의 총점과 평균 점수를 출력
//// 출력시 전체 자릿수는 총점은 6자리, 평균은 7자리로 설정
//// 평균은 소수 둘째자리까지만 산출
//// 평균 산출시에는 3 대신 3.0으로 나누기
//// 출력결과
//// 1. 국어 점수 : 88
//// 2. 영어 점수 : 99
//// 3. 수학 점수 : 88
//// 총 점 : 275
//// 평 균 : 88
////------------------------------------------------------------------------------------------
//#include <stdio.h>
//#include <stdlib.h>
//int main(void) {
//	system("title 성적 프로그램");
//	// 과목 변수 선언 및 초기화
//	int kor = 0, eng = 0, math = 0;
//	// 합계 변수 선언 및 초기화
//	int total = 0;
//	// 평균 변수 선언 및 초기화
//	float average = 0;
//
//	printf("1. 국어 점수를 입력해 주세요. : ");
//	scanf_s("%d", &kor);
//	printf("2. 영어 점수를 입력해 주세요. : ");
//	scanf_s("%d", &eng);
//	printf("3. 수학 점수를 입력해 주세요. : ");
//	scanf_s("%d", &math);
//	// 총점 계산
//	total = kor + eng + math;
//	// 평균 계산
//	average = total / 3.0;
//
//	printf("1. 국어 점수 : %d\n", kor);
//	printf("2. 영어 점수 : %d\n", eng);
//	printf("3. 수학 점수 : %d\n", math);
//	printf("총 점 : %6d\n", total);
//	printf("평 균 : %7.2f\n", average);
//
//	return 0;
//}