#include "baseHeader.h"

void swap(int* a, int* b) {

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}//end swap

int* quickSort(int* array, int start, int end) {

	//���ҵ� ���Ұ� 0���̰ų� 1�� �϶����� �Լ� ȣ��
	if (start >= end) {
		return;
	}//end if

	int pivot = start;	// pivot�� �迭�� ù��° ���ҷ� ����
	int first = pivot + 1;	// pivot ���� ū ���� ã�� ���� first �ε���
	int last = end;	// pivot ���� ���� ���� ã�� ���� last �ε���

	while (first <= last) {

		//�Ǻ� ���� ū �� ���� �� ���� �ε��� ���� first�� ����
		while (first < end && array[first] <= array[pivot]) {
			first++;
		}//end while

		//�Ǻ� ���� ���� �� ���� �� ���� �ε��� ���� last�� ����
		while (last > start && array[last] >= array[pivot]) {
			last--;
		}//end while

		//������ ���� first �ε����� last �ε����� ���ų� first�� ũ�ٸ� Ż��
		if (first >= last) {
			break;
		}
		else {
			//first �ε����� ���� last �ε����� ���� swap
			swap(&array[first], &array[last]);
		}//end if

	}//end while

	//last �ε����� ���� pivot �ε����� ���� ���� �ʴٸ� swap
	if (pivot != last) {
		swap(&array[last], &array[pivot]);
	}//end if

	quickSort(array, start, last - 1);	//�Ǻ� �߽����� ���ʺκ� ����
	quickSort(array, last + 1, end);	//�Ǻ� �߽����� �����ʺκ� ����

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