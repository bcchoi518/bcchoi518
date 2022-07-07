#include<stdio.h>
#include<stdlib.h>
#include<time.h>

// 문이 5개가 있고, 각 문마다 점점 어려운 수식 퀴즈가 출제 (랜덤)
// 맞히면 통과, 틀리면 실패

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
			printf("프로그램을 종료합니다.\n");
			exit(0);
		}
		else if (answer == num1 * num2) {
			// 성공
			success();
			count++;
		}
		else {
			// 실패
			fail();
		}
	}

	printf("\n당신은 5개의 문 중 %d개의 문을 열었습니다.\n", count);

	return 0;
}

int getRandomNumber(int level) {
	return rand() % (level * 7) + 1;
}

void showQuestion(int level, int num1, int num2) {
	printf("\n\n########### %d번째 문 ##########\n", level);
	printf("\n\t %d x %d = ?\n", num1, num2);
	printf("\n############################\n");
	printf("\n비밀번호를 입력하세요 (종료 : -1) >> ");
}

void success() {
	printf("\n >> Good ! 정답입니다. \n");
}

void fail() {
	printf("\n >> 땡 ! 틀렸습니다. \n");
}