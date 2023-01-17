#include <stdio.h>

int main(void) {
	int num = 0;
	printf("마름모 세로길이 입력(3이상의 홀수) : ");
	scanf_s("%d", &num);
	if (num >= 3 && num % 2 == 1) {
		int style = 0, n = 0;
		n = num / 2;
		printf("1. 가득 찬 형태의 마름모\n");
		printf("2. 골다공증 형태의 마름모\n");
		printf("3. 가운데가 비어있는 형태의 마름모\n");
		printf("4. 가운데에 십자가가 있는 형태의 마름모\n");
		printf("위의 Style중 하나를 골라 해당하는 번호를 입력하세요. : ");
		scanf_s("%d", &style);
		printf("\n");
		switch (style) {
		case 1:
			//********************** style 1 *************************
			for (int i = -(n); i < (n + 1); i++) {
				for (int k = 0; k <= abs(i) - 1; k++) {
					printf(" ");
				}
				for (int k = 0; k <= (n - abs(i)) * 2; k++) {
					printf("*");
				}
				printf("\n");
			}
			//********************************************************
			printf("\n");
			break;
		case 2:
			//********************** style 2 *************************
			for (int i = -(n); i < (n + 1); i++) {
				for (int k = 0; k <= abs(i) - 1; k++) {
					printf(" ");
				}
				for (int k = 1; k <= ((n + 1) - abs(i)) * 2 - 1; k++) {
					printf("%s", k % 2 == 0 ? " " : "*");
				}
				printf("\n");
			}
			//********************************************************
			printf("\n");
			break;
		case 3:
			//********************** style 3 *************************
			for (int i = -(n); i < (n + 1); i++) {
				for (int k = 0; k <= abs(i) - 1; k++) {
					printf(" ");
				}
				for (int k = 1; k <= ((n + 1) - abs(i)) * 2 - 1; k++) {
						printf("%s", 1 < k && k <= ((n + 1) - abs(i)) * 2 - 2 ? " ":"*");
				}
				printf("\n");
			}
			//********************************************************
			printf("\n");
			break;
		case 4:
			//********************** style 4 *************************
			for (int i = -(n); i < (n + 1); i++) {
				for (int k = 0; k <= abs(i) - 1; k++) {
					printf(" ");
				}
				for (int k = 1; k <= ((n + 1) - abs(i)) * 2 - 1; k++) {
					if (i == 0) {
						printf("*");
					}
					else if (1 < k && k <= (((n + 1) - abs(i)) * 2 - 2) / 2) {
						printf(" ");
					}
					else if ((((n + 1) - abs(i)) * 2 - 2) / 2 + 1 < k && k <= ((n + 1) - abs(i)) * 2 - 2) {
						printf(" ");
					}
					else {
						printf("*");
					}
				}
				printf("\n");
			}
			//********************************************************
			printf("\n");
			break;
		default:
			printf("잘못 입력하셨습니다.\n1 ~ 4번 보기중 하나를 선택하여 주십시오.\n");
		}
	}
	else {
		printf("잘못 입력하셨습니다.\n3이상의 홀수를 입력하여 주십시오.\n");
	}
	return 0;
}