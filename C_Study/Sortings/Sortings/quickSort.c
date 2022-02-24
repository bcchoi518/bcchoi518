#include "baseHeader.h"

void swap(int* a, int* b) {

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}//end swap

int* quickSort(int* array, int start, int end) {

	//분할된 원소가 0개이거나 1개 일때까지 함수 호출
	if (start >= end) {
		return;
	}//end if

	int pivot = start;	// pivot을 배열의 첫번째 원소로 지정
	int first = pivot + 1;	// pivot 보다 큰 값을 찾기 위한 first 인덱스
	int last = end;	// pivot 보다 작은 값을 찾기 위한 last 인덱스

	while (first <= last) {

		//피봇 보다 큰 값 만날 때 까지 인덱스 값인 first를 증가
		while (first < end && array[first] <= array[pivot]) {
			first++;
		}//end while

		//피봇 보다 작은 값 만날 때 까지 인덱스 값인 last를 감소
		while (last > start && array[last] >= array[pivot]) {
			last--;
		}//end while

		//위에서 계산된 first 인덱스와 last 인덱스가 같거나 first가 크다면 탈출
		if (first >= last) {
			break;
		}
		else {
			//first 인덱스의 값과 last 인덱스의 값을 swap
			swap(&array[first], &array[last]);
		}//end if

	}//end while

	//last 인덱스의 값과 pivot 인덱스의 값이 같지 않다면 swap
	if (pivot != last) {
		swap(&array[last], &array[pivot]);
	}//end if

	quickSort(array, start, last - 1);	//피봇 중심으로 왼쪽부분 분할
	quickSort(array, last + 1, end);	//피봇 중심으로 오른쪽부분 분할

	return array;

}//end quickSort

int main(void) {

	int test[9] = { 0, };
	int testSize = sizeof(test) / sizeof(int);
	int num = 0;
	int dup = 0;

	srand((unsigned)time(NULL));

	for (int i = 0; i < testSize;) {
		num = rand() % 9 + 1;

		for (int k = 0; k < testSize; k++) {
			if (test[k] == num) {
				dup = 1;
				break;
			}//end if
		}//end for
		if (!dup) {
			test[i++] = num;
		}
		else {
			dup = 0;
		}//end if
	}//end for

	printf("========quickSort========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");

	quickSort(test, 0, testSize - 1);

	printf(" after : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");
	return 0;
}//end main