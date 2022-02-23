#include "baseHeader.h"

void swap(int* a, int* b) {

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}//end swap

int* bubbleSort(int* array, int size) {

	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - 1; j++) {
			if (array[j] > array[j + 1]) {
				swap(&array[j], &array[j + 1]);	//인접한 두 수를 비교하여 앞의 수가 크면 뒤의 수와 swap
			}//end if
		}//end for
	}//end for
	return array;
}//end bubblesort

int main(void) {

	int test[6] = { 0, };
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
			}
		}
		if (!dup) {
			test[i++] = num;
		}
		else {
			dup = 0;
		}
	}

	printf("========bubbleSort========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");

	bubbleSort(test, testSize);

	printf(" after : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");
	return 0;
}//end main