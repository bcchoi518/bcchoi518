// 하나의 문제는 단 한번만 풀도록 하는 알고리즘
// 피보나치 수열

#include <stdio.h>

int d[100]; // 한번 푼 문제의 답을 저장하기 위한 배열

int dp(int x)
{
  if (x == 1)
  {
    return 1;
  } // end if
  if (x == 2)
  {
    return 1;
  } // end if
  if (d[x] != 0)
  {
    return d[x]; // 저장해둔 답이 있다면 반환
  }              // end if
  return d[x] = dp(x - 1) + dp(x - 2);
} // end dp

int main(void)
{

  printf("%d", dp(6));
  printf("\n");

  return 0;
}