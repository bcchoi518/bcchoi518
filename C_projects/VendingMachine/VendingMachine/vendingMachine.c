#include<stdio.h>
#include<string.h>
#define MAXROW 3
#define MAXCOL 8

int main(void) {

	char title[30] = "!!BC Vending Machine!!";
	char menu[100] = "1. ��ǰ ����\n2. �ܾ� ����\n3. ��ǰ �Ǹ�\n4. ���α׷� ����";
	char arrProductName[MAXROW][MAXCOL][100] = { "", };
	char arrChartemp[100] = "";
	char balanceReturn = ' ';
	char choiceTemp = ' ';
	int arrProductStock[MAXROW][MAXCOL] = { 0, };
	int arrProductPrice[MAXROW][MAXCOL] = { 0, };
	int arrCashStock[3] = { 0,0,0 };
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
	int totalCashStock = 0;
	int cashStockCheck = 0;
	int cash1000 = 0;
	int cash500 = 0;
	int cash100 = 0;
	int saleStatus = 0;

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
					scanf_s("%s", arrChartemp, sizeof(arrChartemp));
					strcpy_s(arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]), arrChartemp);
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
				totalCashStock = (arrCashStock[0] * 1000) + (arrCashStock[1] * 500) + (arrCashStock[2] * 100);
				printf("  �հ� : %d��\n", totalCashStock);
				printf("==================\n\n");

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
					cashStockCheck = 0;
					for (int i = 0; i < 3; i++) {
						if (totalCashStock == 0) {
							cashStockCheck = 1;
							break;
						}
						else {
							saleStatus = 1;
						}
					}
					if (!cashStockCheck && secondOder == 0) {
						printf("������ �ݾ��� �Է��Ͽ� �ֽʽÿ�(���� �ּ� ���� 100��) : ");//����������� �Աݹޱ�
						scanf_s("%d", &inputMoney);
						if (inputMoney >= 100 && inputMoney % 100 == 0) {
							balance = inputMoney;
							cash1000 = balance / 1000;
							arrCashStock[0] += cash1000;
							balance %= 1000;
							cash500 = balance / 500;
							arrCashStock[1] += cash500;
							balance %= 500;
							cash100 = balance / 100;
							arrCashStock[2] += cash100;
						}
						else {
							printf("���� �ּ� ������ 100�� �Դϴ�. (��ȯ �ݾ� : %d)", inputMoney);
							break;
						}
					}
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
							if (arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] > inputMoney) {
								arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] = 0;
								printf("%9d��  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							else {
								printf("%9d��  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							if (k % MAXCOL == 0) { break; }
						}
						printf("\n");
					}
					printf("======================================================================================================\n");
					printf("%-15s", saleStatus == 1 ? "�Ǹ���" : "�ǸźҰ�");
					printf("���� �ܾ� : %-15d\t\t", inputMoney);
					printf("%15s", arrCashStock[0] > 0 ? " " : "1000���� ����");
					printf("%15s", arrCashStock[1] > 0 ? " " : "500���� ����");
					printf("%15s", arrCashStock[2] > 0 ? " " : "100���� ����");
					printf("\n======================================================================================================\n\n");
					
					if (cashStockCheck) {
						printf("���Ǳ⳻ �ܾ��� �����մϴ�.\n�ܾ� ��� Ȯ���� �ֽʽÿ�.\n\n");
						break;
					}
					
					if (!cashStockCheck || secondOder > 0) {
						printf("��ǰ��ȣ�� �Է��Ͽ� �ֽʽÿ� : "); 
						scanf_s("%d", &productNum);

						productRow = (productNum - 1) / 8;
						productCol = (productNum - 1) % 8;
						balance = inputMoney - arrProductPrice[productRow][productCol];

						if (!strcmp(arrProductName[productRow][productCol], "ǰ��")) {
							printf("ǰ���� ��ǰ�Դϴ�.\n\n");
							goto balanceReturnQ;
						}
						else if (arrProductPrice[productRow][productCol] == 0) {
							printf("�ݾ��� �����մϴ�.\n\n");
							goto balanceReturnQ;
						}
						else {
							printf("�����Ͻ� ��ǰ�� %s �̰� ", arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]));
							printf("������ %d�� �Դϴ�.\n\n", arrProductPrice[productRow][productCol]);
						}
						if (balance >= 0 && arrProductStock[productRow][productCol] > 0) {
							printf("���Ե� �ݾ��� %d�� �̰� �ܾ��� %d���Դϴ�.\n\n", inputMoney, balance);
							arrProductStock[productRow][productCol] -= 1;

						balanceReturnQ:
							rewind(stdin);
							printf("�ܾ��� ��ȯ�Ͻðڽ��ϱ�? (y/n) : ");
							scanf_s("%c", &balanceReturn, sizeof(balanceReturn));
							if (balanceReturn == 'Y' || balanceReturn == 'y') {
								if (balance / 1000 < arrCashStock[0]) {
									cash1000 = balance / 1000;
									arrCashStock[0] -= cash1000;
									balance %= 1000;
								}
								if (balance / 500 < arrCashStock[1]) {
									cash500 = balance / 500;
									arrCashStock[1] -= cash500;
									balance %= 500;
								}
								if (balance / 100 < arrCashStock[2]) {
									cash100 = balance / 100;
									arrCashStock[2] -= cash100;
									balance %= 100;
								}
								if (balance > 0) {
									printf("���Ǳ⳻ �ܾ� �ܰ� �����մϴ�. �����ͷ� �����ֽñ� �ٶ��ϴ�.\n\n");
									break;
								}
								printf("��ȯ�� �ܾ��� 1000���� %d��, 500���� %d��, 100���� %d���Դϴ�.\n", cash1000, cash500, cash100);
								printf("�̿��� �ּż� �����մϴ�.\n\n");
								subMenuSelection = 2;
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