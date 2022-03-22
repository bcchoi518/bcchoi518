#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 10

void push(int *stack, int *top, int data);
void pop(int *stack, int *top);
void peek(int *stack, int *top);

int main(void)
{
  int *stack = (int *)malloc(sizeof(int) * MAX_SIZE);
  int top = 0;

  push(stack, &top, 10);
  push(stack, &top, 20);
  push(stack, &top, 30);
  peek(stack, &top);
  pop(stack, &top);
  push(stack, &top, 40);
  push(stack, &top, 50);
  pop(stack, &top);
  push(stack, &top, 60);
  peek(stack, &top);

  free(stack);
  return 0;
} // end main

void push(int *stack, int *top, int data)
{
  if (*top == MAX_SIZE)
  {
    printf("stack overflow !!!\n");
    return;
  } // end if
  stack[*top] = data;
  printf("%d 삽입\n", stack[*top]);
  (*top)++;
} // end push

void pop(int *stack, int *top)
{
  if (*top == 0)
  {
    printf("stack underflow !!!\n");
  } // end if
  (*top)--;
  printf("%d 삭제\n", stack[*top]);
} // end pop

void peek(int *stack, int *top)
{
  if (*top == 0)
  {
    printf("no data !!!\n");
    return;
  } // end if
  printf("top의 data : %d\n", stack[*top - 1]);
} // end peek