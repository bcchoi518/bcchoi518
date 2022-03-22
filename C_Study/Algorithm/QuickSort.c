// 특정한 값을 기준으로 큰 숫자와 작은 숫자를 나누면 어떨까?
// 퀵 정렬의 시간 복잡도는 O(N * logN)이다.
// 퀵 정렬의 최악 시간 복잡도는 O(N^2)이다.

#include <stdio.h>

int number = 10;
int data[10] = {5, 3, 1, 8, 7, 6, 4, 10, 2, 9};

void quickSort(int *data, int start, int end)
{
  if (start >= end)
  { // 원소가 1개인 경우
    return;
  }

  int key = start; // 키는 첫번째 원소
  int i = start + 1;
  int j = end;
  int temp;

  while (i <= j)
  { // 엇갈릴 때까지  반복
    while (data[i] <= data[key])
    { // 키 값보다 큰 값을 만날때 까지 오른쪽으로 이동
      i++;
    } // end while

    while (data[j] >= data[key] && j > start)
    { // 키 값보다 작은 값을 만날때 까지 왼쪽으로 이동
      j--;
    } // end while

    if (i > j)
    { // 현재 엇갈린 상태면 키값과 교체
      temp = data[j];
      data[j] = data[key];
      data[key] = temp;
    }
    else
    {
      temp = data[j];
      data[j] = data[i];
      data[i] = temp;
    } // end if
  }   // end while

  quickSort(data, start, j - 1);
  quickSort(data, j + 1, end);
} // end quickSort

int main(void)
{
  quickSort(data, 0, number - 1);

  for (int i = 0; i < number; i++)
  {
    printf("%d ", data[i]);
  } // end for

  return 0;
} // end main