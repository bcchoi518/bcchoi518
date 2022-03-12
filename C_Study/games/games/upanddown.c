#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void) {

	srand((unsigned int)time(NULL));
	int num = rand() % 100 + 1;	// 1 ~ 100 사이의 숫자
	printf("숫자 : %d\n", num);
	int answer = 0;	// 정답
	int chance = 5;	// 기회

	while (1) {
		printf("남은 기회 %d 번\n", chance--);
		printf("숫자를 맞혀보세요 (1~100) : ");
		scanf_s("%d", &answer);

		if (answer < num) {
			printf("UP ↑\n\n");
		}
		else if (answer > num) {
			printf("DOWN ↓\n\n");
		}
		else if (chance == 0) {
			printf("모든 기회를 다 사용하셨네요. 아쉽게 실패했습니다.\n");
			break;
		}
		else {
			printf("정답입니다!!\n");
			break;
		}//end if
	}//end while
	return 0;
}//end main