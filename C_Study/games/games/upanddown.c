#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void) {

	srand((unsigned int)time(NULL));
	int num = rand() % 100 + 1;	// 1 ~ 100 ������ ����
	printf("���� : %d\n", num);
	int answer = 0;	// ����
	int chance = 5;	// ��ȸ

	while (1) {
		printf("���� ��ȸ %d ��\n", chance--);
		printf("���ڸ� ���������� (1~100) : ");
		scanf_s("%d", &answer);

		if (answer < num) {
			printf("UP ��\n\n");
		}
		else if (answer > num) {
			printf("DOWN ��\n\n");
		}
		else if (chance == 0) {
			printf("��� ��ȸ�� �� ����ϼ̳׿�. �ƽ��� �����߽��ϴ�.\n");
			break;
		}
		else {
			printf("�����Դϴ�!!\n");
			break;
		}//end if
	}//end while
	return 0;
}//end main