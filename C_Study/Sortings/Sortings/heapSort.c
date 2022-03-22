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
	int largest = parentNode;					//가장 큰 값에 parent node의 인덱스를 넣음

	if (left <= size - 1 && array[left] > array[parentNode])
	{									// left child node 가 트리 전체 크기(인덱스) 보다 작고 left child node의 값이 parent node의 값보다 크다면 수행
		largest = left; // left child node의 인덱스를 가장 큰 값으로 저장
	}									// end if

	if (right <= size - 1 && array[right] > array[largest])
	{									 // right child node 가 트리 전체 크기(인덱스) 보다 작고 right child node의 값이 parent node의 값보다 크다면 수행
		largest = right; // right child node의 인덱스를 가장 큰 값으로 저장
	}									 // end if

	if (largest != parentNode)
	{																						 //가장 큰 값의 인덱스가 parent node의 인덱스와 다르면 수행
		swap(&array[parentNode], &array[largest]); // parent node 의 값과 가장 큰 값의 인덱스에 해당하는 값을 swap
		siftdown(array, largest, size);						 //
	}																						 // end if

	return array;
} // end siftdown

//일반적인 tree를 heap tree로 바꾸는 과정
int *heapify(int *array, int size)
{																	 // max-heap tree (parent node가 child node보다 큼)
	int parentNode = (size / 2) - 1; // child node 가 있는 마지막 parent node 부터 순회
	while (parentNode >= 0)
	{
		siftdown(array, parentNode, size); // tree를 순회하면서 siftdown 수행
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