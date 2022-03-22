// 데이터의 탐색 속도 증진을 위해 사용하는 구조

#include <stdio.h>

int number = 15;

// 하나의 노드 정보를 선언합니다.
typedef struct node *treePointer;
typedef struct node
{
  int data;
  treePointer leftChild, rightChild;
} node;

// 전위 순회를 구현합니다.
void preorder(treePointer ptr)
{
  if (ptr)
  {
    printf("%d ", ptr->data);
    preorder(ptr->leftChild);
    preorder(ptr->rightChild);
  }
}

// 중위 순회를 구현합니다.
void inorder(treePointer ptr)
{
  if (ptr)
  {
    inorder(ptr->leftChild);
    printf("%d ", ptr->data);
    inorder(ptr->rightChild);
  }
}

// 후위 순회를 구현합니다.
void postorder(treePointer ptr)
{
  if (ptr)
  {
    postorder(ptr->leftChild);
    postorder(ptr->rightChild);
    printf("%d ", ptr->data);
  }
}

int main(void)
{
  node nodes[number + 1];
  for (int i = 1; i <= number; i++)
  {
    nodes[i].data = i;
    nodes[i].leftChild = NULL;
    nodes[i].rightChild = NULL;
  }
  for (int i = 1; i <= number; i++)
  {
    if (i % 2 == 0)
    {
      nodes[i / 2].leftChild = &nodes[i];
    }
    else
    {
      nodes[i / 2].rightChild = &nodes[i];
    }
  }
  printf("preorder : ");
  preorder(&nodes[1]);
  printf("\n");
  printf("inorder : ");
  inorder(&nodes[1]);
  printf("\n");
  printf("postorder : ");
  postorder(&nodes[1]);
  printf("\n");
  return 0;
}