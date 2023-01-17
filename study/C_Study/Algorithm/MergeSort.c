// 일단 반으로 나누고 나중에 합쳐서 정렬하면 어떨까?
// 병합 정렬의 시간 복잡도는 O(N * logN)이다.

#include <stdio.h>

int number = 8;
int sorted[8]; // 정렬 배열은 반드시 전역 변수로 선언

void merge(int a[], int m, int middle, int n)
{
  int i = m;
  int j = middle + 1;
  int k = m;
  // 작은 순서대로 배열에 삽입
  while (i <= middle && j <= n)
  {
    if (a[i] <= a[j])
    {
      sorted[k] = a[i];
      i++;
    }
    else
    {
      sorted[k] = a[j];
      j++;
    } // end if
    k++;
  } // end while
  // 남은 데이터도 삽입
  if (i > middle)
  {
    for (int t = j; t <= n; t++)
    {
      sorted[k] = a[t];
      k++;
    } // end for
  }
  else
  {
    for (int t = i; t <= middle; t++)
    {
      sorted[k] = a[t];
      k++;
    } // end for
  }   // end if
  // 정렬된 배열을 삽입
  for (int t = m; t <= n; t++)
  {
    a[t] = sorted[t];
  } // end for
} // end merge

void mergeSort(int a[], int m, int n)
{
  // 크기가 1보다 큰 경우
  if (m < n)
  {
    int middle = (m + n) / 2;
    mergeSort(a, m, middle);
    mergeSort(a, middle + 1, n);
    merge(a, m, middle, n);
  } // end if
} // end mergeSort

int main(void)
{
  int array[8] = {7, 6, 5, 8, 3, 2, 9, 1};
  mergeSort(array, 0, number - 1);
  for (int i = 0; i < number; i++)
  {
    printf("%d ", array[i]);
  } // end for
  return 0;
} // end main