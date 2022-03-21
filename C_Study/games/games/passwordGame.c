#include<stdio.h>
#include<stdlib.h>
#include<time.h>

// ���� 5���� �ְ�, �� ������ ���� ����� ���� ��� ���� (����)
// ������ ���, Ʋ���� ����

int getRandomNumber(int level);
void showQuestion(int level, int num1, int num2);
void success();
void fail();

int main(void) {

	srand((unsigned int)time(NULL));
	int count = 0;
	for (int i = 1; i <= 5; i++) {
		// x * y = ?
		int num1 = getRandomNumber(i);
		int num2 = getRandomNumber(i);
		int answer = -1;
		// printf("%d x %d = ?", num1, num2);
		showQuestion(i, num1, num2);
		scanf_s("%d", &answer);

		if (answer == -1) {
			printf("���α׷��� �����մϴ�.\n");
			exit(0);
		}
		else if (answer == num1 * num2) {
			// ����
			success();
			count++;
		}
		else {
			// ����
			fail();
		}
	}

	printf("\n����� 5���� �� �� %d���� ���� �������ϴ�.\n", count);

	return 0;
}

int getRandomNumber(int level) {
	return rand() % (level * 7) + 1;
}

void showQuestion(int level, int num1, int num2) {
	printf("\n\n########### %d��° �� ##########\n", level);
	printf("\n\t %d x %d = ?\n", num1, num2);
	printf("\n############################\n");
	printf("\n��й�ȣ�� �Է��ϼ��� (���� : -1) >> ");
}

void success() {
	printf("\n >> Good ! �����Դϴ�. \n");
}

void fail() {
	printf("\n >> �� ! Ʋ�Ƚ��ϴ�. \n");
}