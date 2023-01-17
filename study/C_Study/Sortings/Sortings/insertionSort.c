#include "baseHeader.h"

void swap(int* a, int* b) {

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}//end swap

int* insertionSort(int* array, int size) {


	for (int i = 0; i < size; i++) {
		while (i > 0 && array[i - 1] > array[i]) {
			swap(&array[i - 1], &array[i]);
			i--;
		}//end while
	}//end for

	return array;

}//end insertionSort

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

	printf("========insertionSort========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");

	insertionSort(test, testSize);

	printf(" after : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");
	return 0;
}//end main