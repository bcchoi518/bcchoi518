#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  int n, m;
  int *heap = (int *)calloc(1, sizeof(int));
  scanf("%d", &n);

  heap = (int *)realloc(heap, sizeof(int) * n);

  for (int i = 0; i < n; i++)
  {
    scanf("%d", &m);
    heap[i] = m;
  }

  for (int i = 0; i < n; i++)
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
      }
      c = root;
    } while (c != 0);
  }

  for (int i = n - 1; i >= 0; i--)
  {
    int temp = heap[0];
    heap[0] = heap[i];
    heap[i] = temp;

    int root = 0;
    int c = 1;
    do
    {
      c = 2 * root + 1;
      if (heap[c] < heap[c + 1] && c < i - 1)
      {
        c++;
      }
      if (heap[c] > heap[root] && c < i)
      {
        int temp = heap[root];
        heap[root] = heap[c];
        heap[c] = temp;
      }
      root = c;
    } while (c < i);
  }

  for (int i = 0; i < n; i++)
  {
    printf("%d\n", heap[i]);
  }

  return 0;
}