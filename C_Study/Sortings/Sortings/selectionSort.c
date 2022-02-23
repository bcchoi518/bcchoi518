#include "baseHeader.h"

void swap(int* a, int* b) {

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}//end swap

int* selectionSort(int* array, int size) {

	int idxMin = 0;
	int j = 0;

	for (int i = 0; i < size - 1; i++) {

		idxMin = i;
		j = i + 1;

		while (j < size) {

			if (array[j] < array[idxMin]) {
				idxMin = j;
			}//end if

			j++;

		}//end while

		if (idxMin != i) {
			swap(&array[idxMin], &array[i]);
		}//end if
	}//end for
	return array;
}//end selectionSort

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

	printf("========selectionSort========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");

	selectionSort(test, testSize);

	printf(" after : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");
	return 0;
}//end main