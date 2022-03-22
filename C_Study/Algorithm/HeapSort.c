// 힙(Heap)을 이용해 데이터를 정렬하면 어떨까?
// 힙 생성 알고리즘의 시간 복잡도는 O(logN)이다. But 전체 노드를 확인하지 않으므로 힙 구조를 만드는데는 O(N)에 가까운 시간이 걸린다.
// 힙 정렬의 시간 복잡도는 O(N * logN)이다.

#include <stdio.h>

int number = 9;
int heap[9] = {7, 6, 5, 8, 3, 5, 9, 1, 6};

int main(void)
{
  // 먼저 전체 트리 구조를 최대 힙 구조로 바꿉니다.
  for (int i = 1; i < number; i++)
  {
    int c = i;
    do
    {
      int root = (c - 1) / 2;
      if (heap[root] < heap[c])
      {
        int temp = heap[root];
        heap[root] = heap[c];
        heap[c] = temp;
      } // end if
      c = root;
    } while (c != 0); // end while
  }                   // end for

  // 크기를 줄여가며 반복적으로 힙을 구성
  for (int i = number - 1; i >= 0; i--)
  {
    // 가장 큰 값을 마지막 노드로 보냄
    int temp = heap[0];
    heap[0] = heap[i];
    heap[i] = temp;
    // 다시 힙 구조를 만들기
    int root = 0;
    int c = 1;
    do
    {
      c = 2 * root + 1;
      // 자식 중에 더 큰 값을 찾기
      if (heap[c] < heap[c + 1] && c < i - 1)
      {
        c++;
      } // end if
      // 루트보다 자식이 더 크다면 교환
      if (heap[root] < heap[c] && c < i)
      {
        int temp = heap[root];
        heap[root] = heap[c];
        heap[c] = temp;
      } // end if
      root = c;
    } while (c < i); // end while
  }                  // end for

  for (int i = 0; i < number; i++)
  {
    printf("%d ", heap[i]);
  } // end for

  return 0;
} // end main