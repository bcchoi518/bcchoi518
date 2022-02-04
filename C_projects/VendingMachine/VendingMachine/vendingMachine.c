#include<stdio.h>
#include<string.h>
#define MAXROW 3
#define MAXCOL 8

int main(void) {

	char title[30] = "!!BC Vending Machine!!";
	char menu[100] = "1. ��ǰ ����\n2. �ܾ� ����\n3. ��ǰ �Ǹ�\n4. ���α׷� ����";
	char arrProductName[MAXROW][MAXCOL][100] = { "", };
	char arrtemp[100] = "";
	char balanceReturn = ' ';
	char choiceTemp = ' ';
	int arrProductStock[MAXROW][MAXCOL] = { 0, };
	int arrProductPrice[MAXROW][MAXCOL] = { 0, };
	int arrCashStock[5] = { 10,10,10,10,10 };
	int menuSelection = 0;
	int subMenuSelection = 0;
	int productNum = 0;
	int productCnt = 0;
	int productRow = 0;
	int productCol = 0;
	int monetaryUnit = 0;
	int inputMoney = 0;
	int balance = 0;
	int secondOder = 0;
	int cashStockCheck = 0;
	int cash1000 = 0;
	int cash500 = 0;
	int cash100 = 0;
	int cash50 = 0;
	int cash10 = 0;
	int isDup = 0;
	
	while (menuSelection != 4) {
		printf("%s\n", menu);
		printf("�׸� ���� : ");
		scanf_s("%d", &menuSelection);
		subMenuSelection = 0;
		

		switch (menuSelection) {
		case 1:// ��ǰ ����
			while (subMenuSelection != 4) {
				printf("\n============================================��ǰ ��� ��Ȳ============================================\n\n");
				productCnt = 0;
				for (int i = MAXROW - 1; i >= 0; i--) {
					for (int k = MAXCOL - 1; k >= 0; k--) {
						productCnt++;
						if (arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k] == 0) {
							strcpy_s(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k], sizeof(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]), "������");
							arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] = 0;
							printf("%2d.%8s  ", productCnt, arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						}
						else {
							printf("%2d.%8s  ", productCnt, arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						}
						if (k % MAXCOL == 0) { break; }
					}
					printf("\n");
					for (int k = MAXCOL - 1; k >= 0; k--) {
						printf("%9d��  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						if (k % MAXCOL == 0) { break; }
					}
					printf("\n");
					for (int k = MAXCOL - 1; k >= 0; k--) {
						printf("%9d��  ", arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						if (k % MAXCOL == 0) { break; }
					}
					printf("\n");
					printf("\n");
				}
				printf("======================================================================================================\n\n");

				printf("1. ��ǰ �޴� ����\n2. ��ǰ ��� ����\n3. ��ǰ ���� ����\n4. ������\n");
				printf("�׸� ���� : ");
				scanf_s("%d", &subMenuSelection);
				printf("\n");

				switch (subMenuSelection) {
				case 1://��ǰ �޴� ����
					printf("������ ��ǰ��ȣ�� �Է��ϼ��� : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					printf("������ ��ǰ���� �Է��ϼ��� : ");
					scanf_s("%s", arrtemp, sizeof(arrtemp));
					strcpy_s(arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]), arrtemp);
					printf("������ �Է��ϼ��� : ");
					scanf_s("%d", arrProductPrice[productRow] + productCol);
					printf("��� �Է��ϼ��� : ");
					scanf_s("%d", arrProductStock[productRow] + productCol);
					break;

				case 2://��ǰ ��� ����
					printf("������ ��ǰ��ȣ�� �Է��ϼ��� : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					if (!strcmp(arrProductName[productRow][productCol], "������")) {
						printf("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.\n\n");
					}
					else {
						printf("������ �Է��ϼ��� : ");
						scanf_s("%d", arrProductStock[productRow] + productCol);
					}
					break;

				case 3://��ǰ ���� ����
					printf("������ ��ǰ��ȣ�� �Է��ϼ��� : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					if (!strcmp(arrProductName[productRow][productCol], "������")) {
						printf("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.\n\n");
					}
					else {
						printf("���ݸ� �Է��ϼ��� : ");
						scanf_s("%d", arrProductPrice[productRow] + productCol);
					}
					break;

				case 4://������
					break;

				default:
					printf("Error : �߸� �Է��ϼ̽��ϴ�.\n1 ~ 4 �׸� �� �ϳ��� �����Ͻʽÿ�.\n");
					break;
				}
			}
			break;

		case 2://�ܾ� ����
			while (subMenuSelection != 2) {
				printf("\n==�ܾ� ��� ��Ȳ==\n");
				printf("1000�� : %d��\n", arrCashStock[0]);
				printf(" 500�� : %d��\n", arrCashStock[1]);
				printf(" 100�� : %d��\n", arrCashStock[2]);
				printf("  50�� : %d��\n", arrCashStock[3]);
				printf("  10�� : %d��\n", arrCashStock[4]);
				printf("==================\n");

				printf("1. �ܾ� ��� ����\n2. ������\n");
				printf("�׸� ���� : ");
				scanf_s("%d", &subMenuSelection);
				printf("\n");

				switch (subMenuSelection) {
				case 1://�ܾ� ��� ����
					printf("��� ������ ȭ���� ������ �Է��Ͻÿ� : ");
					scanf_s("%d", &monetaryUnit);
					if (monetaryUnit == 1000) {
						printf("������ ����� ������ �Է��Ͻÿ� : ");
						scanf_s("%d", arrCashStock + 0);
					}
					else if (monetaryUnit == 500) {
						printf("������ ����� ������ �Է��Ͻÿ� : ");
						scanf_s("%d", arrCashStock + 1);
					}
					else if (monetaryUnit == 100) {
						printf("������ ����� ������ �Է��Ͻÿ� : ");
						scanf_s("%d", arrCashStock + 2);
					}
					else if (monetaryUnit == 50) {
						printf("������ ����� ������ �Է��Ͻÿ� : ");
						scanf_s("%d", arrCashStock + 3);
					}
					else if (monetaryUnit == 10) {
						printf("������ ����� ������ �Է��Ͻÿ� : ");
						scanf_s("%d", arrCashStock + 4);
					}
					else {
						printf("Error : �߸� �Է��ϼ̽��ϴ�.\nȭ�� ������ Ȯ�� �� �ٽ� �Է��Ͻʽÿ�.\n");
					}
					break;

				case 2://������
					break;

				default:
					printf("Error : �߸� �Է� �ϼ̽��ϴ�.");
					break;
				}
			}
			break;

		case 3://��ǰ �Ǹ�
			printf("\n");
			printf("1. �Ǹ� ����\n2. ������\n");
			printf("�׸� ���� : ");
			scanf_s("%d", &subMenuSelection);
			printf("\n");

			switch (subMenuSelection) {
			case 1://�Ǹ� ����
				while (subMenuSelection != 2) {
					printf("\n========================================%s========================================\n\n", title);
					productCnt = 0;
					for (int i = MAXROW - 1; i >= 0; i--) {
						for (int k = MAXCOL - 1; k >= 0; k--) {
							productCnt++;
							if (arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k] == 0) {
								strcpy_s(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k], sizeof(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]), "ǰ��");
								arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] = 0;
								printf("%2d.%8s  ", productCnt, arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							else {
								printf("%2d.%8s  ", productCnt, arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							if (k % MAXCOL == 0) { break; }
						}
						printf("\n");
						for (int k = MAXCOL - 1; k >= 0; k--) {
							printf("%9d��  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							if (k % MAXCOL == 0) { break; }
						}
						printf("\n");
					}
					printf("======================================================================================================\n");
					printf("%15s", arrCashStock[0] > 0 ? " " : "1000���� ����");
					printf("%15s", arrCashStock[1] > 0 ? " " : "500���� ����");
					printf("%15s", arrCashStock[2] > 0 ? " " : "100���� ����");
					printf("%15s", arrCashStock[3] > 0 ? " " : "50���� ����");
					printf("%15s", arrCashStock[4] > 0 ? " " : "10���� ����");
					printf("\n======================================================================================================\n\n");

					cashStockCheck = 0;
					for (int i = 0; i < 5; i++) {
						if (arrCashStock[i] == 0) {
							cashStockCheck = 1;
							break;
						}
					}
					if (cashStockCheck) {
						printf("���Ǳ⳻ �ܾ��� �����մϴ�.\n�ܾ� ��� Ȯ���� �ֽʽÿ�.\n\n");
						break;
					}
					if (!cashStockCheck && secondOder == 0) {
						printf("�ݾ��� �����Ͽ� �ֽʽÿ� : ");
						scanf_s("%d", &inputMoney);
					}
					if (!cashStockCheck || secondOder > 0) {
						printf("��ǰ��ȣ�� �Է��Ͽ� �ֽʽÿ� : ");
						scanf_s("%d", &productNum);

						productRow = (productNum - 1) / 8;
						productCol = (productNum - 1) % 8;

						printf("�����Ͻ� ��ǰ�� %s �̰� ", arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]));
						printf("������ %d�� �Դϴ�.\n", arrProductPrice[productRow][productCol]);

						balance = inputMoney - arrProductPrice[productRow][productCol];
						if (balance >= 0 && arrProductStock[productRow][productCol] > 0) {
							printf("���Ե� �ݾ��� %d�� �̰� �ܾ��� %d���Դϴ�.\n", inputMoney, balance);
							arrProductStock[productRow][productCol] -= 1;

						balanceReturnQ:
							rewind(stdin);
							printf("�ܾ��� ��ȯ�Ͻðڽ��ϱ�? (y/n) : ");
							scanf_s("%c", &balanceReturn, sizeof(balanceReturn));
							if (balanceReturn == 'Y' || balanceReturn == 'y') {
								cash1000 = balance / 1000;
								balance = balance % 1000;
								cash500 = balance / 500;
								balance = balance % 500;
								cash100 = balance / 100;
								balance = balance % 100;
								cash50 = balance / 50;
								balance = balance % 50;
								cash10 = balance / 10;
								printf("��ȯ�� �ܾ��� 1000���� %d��, 500���� %d��, 100���� %d��, 50���� %d��, 10���� %d�� �Դϴ�.\n\n", cash1000, cash500, cash100, cash50, cash10);
								arrCashStock[0] -= cash1000;
								arrCashStock[1] -= cash500;
								arrCashStock[2] -= cash100;
								arrCashStock[3] -= cash50;
								arrCashStock[4] -= cash10;
								break;
							}
							else if (balanceReturn == 'N' || balanceReturn == 'n') {
								inputMoney = balance;
								secondOder = 1;
								continue;
							}
							else {
								printf("Error : �߸� �Է��ϼ̽��ϴ�.\n");
								goto balanceReturnQ;
							}
						}
						else if (arrProductStock[productRow][productCol] == 0) {
							printf("�����Ͻ� ��ǰ�� ��� �����մϴ�.\n\n");
						}
						else {
							printf("�ݾ��� �����մϴ�.\n\n");
							break;
						}
					}
				}
				break;
			case 2://������
				break;
			}
			break;

		case 4://���α׷� ����
			printf("�̿��� �ּż� �����մϴ�.\n");
			break;

		default:
			printf("1 ~ 3 �׸� �� �ϳ��� �����Ͽ� �ֽʽÿ�.\n");
			break;
		}
	}
	return 0;
}