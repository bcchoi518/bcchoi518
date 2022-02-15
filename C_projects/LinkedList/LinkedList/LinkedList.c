#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// ����ü ����
typedef struct data {
	int num;
	char name[20];
	struct data* next;
}data;

// ����ü�� �����ϴ� ���������Ϳ� ��������
data* g_head = NULL;
data* g_tail = NULL;

// node ã��
data* find(int num) {
	if (g_head == NULL) {
		printf("no data...\n");
	}
	data* temp = g_head;
	while (temp) {
		if (temp->num == num) {
			return temp;
		}
		temp = temp->next;
	}
	return NULL;
}

// node ��ü ���
void printfAll() {
	if (g_head == NULL) {
		printf("no data...\n");
		return;
	}
	data* temp = g_head;
	while (temp) {
		printf("--------- start ---------\n");
		printf("num : %d\n", temp->num);
		printf("name : %s\n", temp->name);
		printf("---------- end ----------\n");
		temp = temp->next;
	}
}
// node ����
int insert(int num, char* name) {

	data* node = (data*)malloc(sizeof(data));

	node->num = num;
	if (name != NULL) {
		strcpy_s(node->name, sizeof(node->name), name);
	}
	node->next = NULL;

	if (g_head == NULL) {
		g_head = node;
		g_tail = node;
		return 1;
	}
	else {
		data* temp = g_head;
		while (temp->next) {
			temp = temp->next;
		}
		temp->next = node;
		g_tail = node;
		return 1;
	}
	return 0;
}

// queue deQueue
data* deQueue() {
	if (g_head == NULL) {
		return NULL;
	}
	data* node = g_head;

	if (g_head->next != NULL) {
		g_head = g_head->next;
	}
	else {
		g_head = NULL;
		g_tail = NULL;
	}

	return node;
}

// stack pop
data* stack_pop() {
	if (g_head == NULL) {
		return NULL;
	}

	data* node = g_tail;
	data* temp = g_head;
	data* before = NULL;

	while (temp->next) {
		before = temp;
		temp = temp->next;
	}
	g_tail = before;

	if (before != NULL) {
		before->next = NULL;
	}
	if (g_tail == NULL) {
		g_head = NULL;
	}
	return node;
}


int main() {

	char name[20] = "";
	// node ���� �� ���
	for (int i = 0; i < 10; i++) {
		sprintf_s(name, sizeof(name), "Test %d", i);
		insert(i, name);
	}
	printfAll();
/*
	// ã�� ��� ���
	data* node = find(5);
	if (node != NULL) {
		printf("find num : %d\n", node->num);
		printf("find name : %s\n", node->name);
	}
	else {
		printf("Error\n");
	}
*/
/*
	// stack pop���
	for (int i = 0; i < 10; i++) {
		data* popNode = stack_pop();
		printf("------- pop start -------\n");
		printf("pop num : %d\n", popNode->num);
		printf("pop name : %s\n", popNode->name);
		printf("-------- pop end --------\n");
		free(popNode);
		printfAll();
	}
*/

	// Queue deQueue���
	for (int i = 0; i < 10; i++) {
		data* deQueueNode = deQueue();
		printf("----- deQueue start -----\n");
		printf("deQueueNode num : %d\n", deQueueNode->num);
		printf("deQueueNode name : %s\n", deQueueNode->name);
		printf("------ deQueue end ------\n");
		free(deQueueNode);
		printfAll();
	}

	return 0;
}