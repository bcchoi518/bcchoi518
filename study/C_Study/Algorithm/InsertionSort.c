// 각 숫자를 적절한 위치에 삽입하면 어떨까?
// 삽입 정렬의 시간 복잡도는 O(N^2)이다.

#include <stdio.h>

int main(void)
{

  int i, j, temp;
  int array[10] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

  for (i = 0; i < 9; i++)
  {
    j = i;
    while (array[j] > array[j + 1])
    {
      temp = array[j];
      array[j] = array[j + 1];
      array[j + 1] = temp;
      j--;
    } // end while
  }   // end for

  for (i = 0; i < 10; i++)
  {
    printf("%d ", array[i]);
  } // end for

  return 0;
} // end main