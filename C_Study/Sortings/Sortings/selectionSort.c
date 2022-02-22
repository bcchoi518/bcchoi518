#include <stdio.h>

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
}//end bubblesort

int main(void) {

	int num1[6] = { 2, 6, 1, 3, 5, 4 };
	int num2[6] = { 6, 3, 4, 1, 2, 5 };
	int num3[6] = { 6, 5, 4, 3, 2, 1 };

	int* test = num2;
	int testSize = sizeof(num2) / sizeof(int);

	selectionSort(test, testSize);

	for (int i = 0; i < 6; i++) {
		printf("%d ", test[i]);
	}//end for

	return 0;
}//end main