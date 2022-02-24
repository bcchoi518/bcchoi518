#include "baseHeader.h"

int temp_arr[9];

void merge(int* arr, int start, int middle, int end) {
	int i = start;
	int j = middle + 1;
	int k = start;

	//���Ͽ� ���������� �� ����
	while (i <= middle && j <= end) {
		if (arr[i] <= arr[j]) temp_arr[k] = arr[i++];
		else temp_arr[k] = arr[j++];
		k++;
	}

	//���� ������ ����
	if (i > middle) {
		for (int t = j; t <= end; ++t) {
			temp_arr[k] = arr[t];
			++k;
		}
	}
	else {
		for (int t = i; t <= middle; ++t) {
			temp_arr[k] = arr[t];
			++k;
		}
	}

	//�ӽ� ����� �迭�� ����� ���� ���� �迭�� �־���
	for (int t = start; t <= end; ++t) {
		arr[t] = temp_arr[t];
	}
}


void mergeSort(int* arr, int start, int end) {
	//ũ�Ⱑ 1 �ϴ� ���� ȣ��, 1���� ���� �ɰ�
	if (start < end) {
		int middle = (start + end) / 2;
		mergeSort(arr, start, middle);
		mergeSort(arr, middle + 1, end);
		//�ٽ� ����
		merge(arr, start, middle, end);
	}
}

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

	printf("========mergeSort========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");

	mergeSort(test, 0, testSize - 1);

	printf(" after : ");
	for (int i = 0; i < testSize; i++) {
		printf("%d ", test[i]);
	}//end for
	printf("\n");
	return 0;
}//end main