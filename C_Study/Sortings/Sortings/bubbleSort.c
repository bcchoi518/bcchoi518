#include <stdio.h>

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

	int num1[6] = { 2, 6, 1, 3, 5, 4 };
	int num2[6] = { 6, 3, 4, 1, 2, 5 };
	int num3[6] = { 6, 5, 4, 3, 2, 1 };

	int* test = num1;
	int testSize = sizeof(num1) / sizeof(int);

	bubbleSort(test, testSize);

	for (int i = 0; i < 6; i++) {
		printf("%d ", test[i]);
	}//end for

	return 0;
}//end main