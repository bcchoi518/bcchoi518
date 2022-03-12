#include <stdio.h>
#include <time.h>

// ����Ⱑ 6������ �־��
// �̵��� ���׿� ��� �ִµ�, �縷�̿���
// �縷�� �ʹ� ������, �ʹ� �����ؼ� ���� ���� ���� ������ �ؿ�
// ���� �� �����ϱ� ���� �������� ���׿� ���� �༭ ����⸦ ����ּ���~~
// ������ �ð��� �������� ���� Ŀ����... ���߿���.. �ȳ�...

int level = 0;
int arrayFish[6] = { 0, };
int* cursor = NULL;

void initData();
void printfFishes();
void decreaseWater(long elapsedTime);

int main(void) {
	long startTime = 0;	// ���� ���� �ð�
	long totalElapsedTime = 0;	// �� ��� �ð�
	long prevElapsedTime = 0;	// ���� ��� �ð� (�ֱٿ� ���� �� �ð� ����)
	int num; // �� �� ���׿� ���� �� ������, ����� �Է�
	initData();

	cursor = arrayFish; // cursor[0] ... cursor[5] ���� ���õ� ����

	startTime = clock();	//	���� �ð��� millisecond (1000���� 1��) ������ ��ȯ

	while (1) {
		printfFishes();
		printf("�� �� ���׿� ���� �ֽðھ��? >> ");
		num = getche() - 48;
		printf("\n");

		// �Է°� üũ
		if (num < 1 || 6 < num) {
			printf("\n�Է°��� �߸��Ǿ����ϴ�.\n");
			continue;
		}

		totalElapsedTime = (clock() - startTime) / CLOCKS_PER_SEC;
		printf("�� ��� �ð� : %ld ��\n", totalElapsedTime);

		// ���� �� �� �ð�(���������� �� �� �ð�) ���ķ� �帥 �ð�
		prevElapsedTime = totalElapsedTime - prevElapsedTime;
		printf("�ֱ� ��� �ð� : %ld ��\n", prevElapsedTime);

		// ������ ���� ���� (����)
		decreaseWater(prevElapsedTime);

		// ����ڰ� �Է��� ���׿� ���� �ش�
		// 1. ������ ���� 0 �̸�? ���� ���� �ʴ´�... �̹� ����Ⱑ.. �Ф� ����..
		if (cursor[num - 1] <= 0) {
			printf("%d �� ������ �̹� �׾����ϴ�.. ���� ���� �ʽ��ϴ�.\n", num);
		}
		// 2. ������ ���� 0�� �ƴ� ���? ���� �ش� ! 100�� ���� �ʴ��� üũ
		else if (cursor[num - 1] + 1 <= 100) {
			//���� �ش�
			printf("%d �� ���׿� ���� �ݴϴ�.\n", num);
			cursor[num - 1] += 2;	// cursor[num - 1] = cursor[num - 1] + 1
		}

		// �������� �� ���� Ȯ�� (�������� 20�ʸ��� �ѹ��� ����)
		if (totalElapsedTime / 20 > level - 1) {
			level++;	// level : 1 -> level : 2 -> level : 3 ...
			printf(" *** �� ������ ! ���� %d �������� %d ������ ���׷��̵� ***\n\n", level - 1, level);

			// ���� ���� : 5
			if (level == 5) {
				printf("\n\n �����մϴ�! �ְ� ������ �޼��Ͽ����ϴ�. ������ �����մϴ�.\n\n");
				exit(0);
			}
		}

		// ��� ����Ⱑ �׾����� Ȯ��
		if (checkFishAlive() == 0) {
			// ����Ⱑ ��� .. �Ф�
			printf("��� ����Ⱑ.. �Ф� ����..\n");
			exit(0);
		}
		else {
			//�ּ� �Ѹ��� �̻��� ������ ��� ����
			printf("����Ⱑ ���� ��� �־��!\n");
		}
		prevElapsedTime = totalElapsedTime;

		// 10�� -> 15�� (5�� : prevElapsedTime -> 15��) -> 25�� (10��...?)
		
	}

	return 0;
}

void initData() {
	level = 1; // ���� ���� (1~5)
	for (int i = 0; i < 6; i++) {
		arrayFish[i] = 100; // ������ �� ���� (0~100)
	}
}

void printfFishes() {
	printf("%3d�� %3d�� %3d�� %3d�� %3d�� %3d��\n", 1, 2, 3, 4, 5, 6);
	for (int i = 0; i < 6; i++) {
		printf(" %4d ", arrayFish[i]);
	}
	printf("\n\n");
}

void decreaseWater(long elapsedTime) {
	for (int i = 0; i < 6; i++) {
		arrayFish[i] -= (level * 2 * (int)elapsedTime);	// 2 : ���̵� ������ ���� ��
		if (arrayFish[i] < 0) {
			arrayFish[i] = 0;
		}
	}
}

int checkFishAlive() {
	for (int i = 0; i < 6; i++) {
		if (arrayFish[i] > 0) {
			return 1;	// true
		}
	}
	return 0;
}