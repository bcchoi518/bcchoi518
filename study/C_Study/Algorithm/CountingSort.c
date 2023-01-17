// 크기를 기준으로 갯수를 세면 어떨까?
// 계수 정렬의 시간 복잡도는 O(N)이다. '범위조건'이 있는 경우에 한해서 굉장히 빠른 알고리즘

#include <stdio.h>

int main(void)
{
  int temp;
  int count[5];
  int array[30] = {1, 3, 2, 4, 3, 2, 5, 3, 1, 2, 3, 4, 4, 3, 5, 1, 2, 3, 5, 2, 3, 1, 4, 3, 5, 1, 2, 1, 1, 1};
  for (int i = 0; i < 5; i++)
  {
    count[i] = 0;
  } // end for
  for (int i = 0; i < 30; i++)
  {
    count[array[i] - 1]++;
  } // end for
  for (int i = 0; i < 5; i++)
  {
    if (count[i] != 0)
    {
      for (int j = 0; j < count[i]; j++)
      {
        printf("%d ", i + 1);
      } // end for
    }   // end if
  }     // end for
  return 0;
} // end main