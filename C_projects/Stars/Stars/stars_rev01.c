#include <stdio.h>

int main(void) {
	int num = 0;
	printf("������ ���α��� �Է�(3�̻��� Ȧ��) : ");
	scanf_s("%d", &num);
	if (num >= 3 && num % 2 == 1) {
		int style = 0, n = 0;
		n = num / 2;
		printf("1. ���� �� ������ ������\n");
		printf("2. ��ٰ��� ������ ������\n");
		printf("3. ����� ����ִ� ������ ������\n");
		printf("4. ����� ���ڰ��� �ִ� ������ ������\n");
		printf("���� Style�� �ϳ��� ��� �ش��ϴ� ��ȣ�� �Է��ϼ���. : ");
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
			printf("�߸� �Է��ϼ̽��ϴ�.\n1 ~ 4�� ������ �ϳ��� �����Ͽ� �ֽʽÿ�.\n");
		}
	}
	else {
		printf("�߸� �Է��ϼ̽��ϴ�.\n3�̻��� Ȧ���� �Է��Ͽ� �ֽʽÿ�.\n");
	}
	return 0;
}