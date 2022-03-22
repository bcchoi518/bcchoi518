#include "baseHeader.h"

void swap(int *a, int *b)
{

	int temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

} // end swap

int *siftdown(int *array, int parentNode, int size)
{

	int left = (2 * parentNode) + 1;	// left child node
	int right = (2 * parentNode) + 2; // right child node
	int largest = parentNode;					//���� ū ���� parent node�� �ε����� ����

	if (left <= size - 1 && array[left] > array[parentNode])
	{									// left child node �� Ʈ�� ��ü ũ��(�ε���) ���� �۰� left child node�� ���� parent node�� ������ ũ�ٸ� ����
		largest = left; // left child node�� �ε����� ���� ū ������ ����
	}									// end if

	if (right <= size - 1 && array[right] > array[largest])
	{									 // right child node �� Ʈ�� ��ü ũ��(�ε���) ���� �۰� right child node�� ���� parent node�� ������ ũ�ٸ� ����
		largest = right; // right child node�� �ε����� ���� ū ������ ����
	}									 // end if

	if (largest != parentNode)
	{																						 //���� ū ���� �ε����� parent node�� �ε����� �ٸ��� ����
		swap(&array[parentNode], &array[largest]); // parent node �� ���� ���� ū ���� �ε����� �ش��ϴ� ���� swap
		siftdown(array, largest, size);						 //
	}																						 // end if

	return array;
} // end siftdown

//�Ϲ����� tree�� heap tree�� �ٲٴ� ����
int *heapify(int *array, int size)
{																	 // max-heap tree (parent node�� child node���� ŭ)
	int parentNode = (size / 2) - 1; // child node �� �ִ� ������ parent node ���� ��ȸ
	while (parentNode >= 0)
	{
		siftdown(array, parentNode, size); // tree�� ��ȸ�ϸ鼭 siftdown ����
		parentNode -= 1;
	} // end while

	return array;
} // end heapify

int *heapSort(int *array, int size)
{

	int end = size - 1;
	while (end > 0)
	{
		swap(&array[0], &array[end]);
		siftdown(array, 0, end);
		end -= 1;
	} // end while

	return array;
} // end heapSort

int main(void)
{

	int test[9] = {
			0,
	};
	int testSize = sizeof(test) / sizeof(int);
	int num = 0;
	int dup = 0;

	srand((unsigned)time(NULL));

	for (int i = 0; i < testSize;)
	{
		num = rand() % 9 + 1;

		for (int k = 0; k < testSize; k++)
		{
			if (test[k] == num)
			{
				dup = 1;
				break;
			} // end if
		}		// end for
		if (!dup)
		{
			test[i++] = num;
		}
		else
		{
			dup = 0;
		} // end if
	}		// end for

	printf("=========heapTree=========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++)
	{
		printf("%d ", test[i]);
	} // end for
	printf("\n");

	heapify(test, testSize);

	printf(" after : ");
	for (int i = 0; i < testSize; i++)
	{
		printf("%d ", test[i]);
	} // end for
	printf("\n");
	printf("==========================\n");
	printf("\n");

	printf("=========heapSort=========\n");
	printf("before : ");
	for (int i = 0; i < testSize; i++)
	{
		printf("%d ", test[i]);
	} // end for
	printf("\n");

	heapSort(test, testSize);

	printf(" after : ");
	for (int i = 0; i < testSize; i++)
	{
		printf("%d ", test[i]);
	} // end for
	printf("\n");
	printf("==========================\n");
	printf("\n");

	return 0;
} // end main