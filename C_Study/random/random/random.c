#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int getNumber() {
	return rand() % 45 + 1;
}
int main(void) {

	short int lotto[6] = { 0, };
	int i = 0, k = 0, num = 0;
	char dup = 'N';

	printf("** �ζ� ��÷�� �����մϴ�. **\n\n");
	srand((unsigned)time(NULL));

	for (i = 0; i < 6;) {
		num = getNumber();

		for (k = 0; k < 6; k++) {
			if (lotto[k] == num) {
				dup = 'Y';
			}
		}
		if (dup == 'N') {
				lotto[i++] = num;
		}
		else {
			dup = 'N';
		}
	}
	printf("��÷�� �ζ� ��ȣ ==> ");
	for (i = 0; i < 6; i++) {
		printf("%d ", lotto[i]);
	}
	printf("\n");

	return 0;
}