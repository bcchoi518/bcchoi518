#include<stdio.h>
#include<string.h>
#define MAXROW 3
#define MAXCOL 8

int main(void) {

	char title[30] = "!!BC Vending Machine!!";
	char menu[100] = "1. 상품 관리\n2. 잔액 관리\n3. 상품 판매\n4. 프로그램 종료";
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
		printf("항목 선택 : ");
		scanf_s("%d", &menuSelection);
		subMenuSelection = 0;
		

		switch (menuSelection) {
		case 1:// 상품 관리
			while (subMenuSelection != 4) {
				printf("\n============================================상품 재고 현황============================================\n\n");
				productCnt = 0;
				for (int i = MAXROW - 1; i >= 0; i--) {
					for (int k = MAXCOL - 1; k >= 0; k--) {
						productCnt++;
						if (arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k] == 0) {
							strcpy_s(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k], sizeof(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]), "재고없음");
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
						printf("%9d원  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						if (k % MAXCOL == 0) { break; }
					}
					printf("\n");
					for (int k = MAXCOL - 1; k >= 0; k--) {
						printf("%9d개  ", arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
						if (k % MAXCOL == 0) { break; }
					}
					printf("\n");
					printf("\n");
				}
				printf("======================================================================================================\n\n");

				printf("1. 상품 메뉴 변경\n2. 상품 재고 변경\n3. 상품 가격 변경\n4. 나가기\n");
				printf("항목 선택 : ");
				scanf_s("%d", &subMenuSelection);
				printf("\n");

				switch (subMenuSelection) {
				case 1://상품 메뉴 변경
					printf("변경할 상품번호를 입력하세요 : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					printf("변경할 상품명을 입력하세요 : ");
					scanf_s("%s", arrtemp, sizeof(arrtemp));
					strcpy_s(arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]), arrtemp);
					printf("가격을 입력하세요 : ");
					scanf_s("%d", arrProductPrice[productRow] + productCol);
					printf("재고를 입력하세요 : ");
					scanf_s("%d", arrProductStock[productRow] + productCol);
					break;

				case 2://상품 재고 변경
					printf("변경할 상품번호를 입력하세요 : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					if (!strcmp(arrProductName[productRow][productCol], "재고없음")) {
						printf("상품이 등록되지 않았습니다.\n\n");
					}
					else {
						printf("수량를 입력하세요 : ");
						scanf_s("%d", arrProductStock[productRow] + productCol);
					}
					break;

				case 3://상품 가격 변경
					printf("변경할 상품번호를 입력하세요 : ");
					scanf_s("%d", &productNum);

					productRow = (productNum - 1) / 8;
					productCol = (productNum - 1) % 8;

					if (!strcmp(arrProductName[productRow][productCol], "재고없음")) {
						printf("상품이 등록되지 않았습니다.\n\n");
					}
					else {
						printf("가격를 입력하세요 : ");
						scanf_s("%d", arrProductPrice[productRow] + productCol);
					}
					break;

				case 4://나가기
					break;

				default:
					printf("Error : 잘못 입력하셨습니다.\n1 ~ 4 항목 중 하나를 선택하십시오.\n");
					break;
				}
			}
			break;

		case 2://잔액 관리
			while (subMenuSelection != 2) {
				printf("\n==잔액 재고 현황==\n");
				printf("1000원 : %d장\n", arrCashStock[0]);
				printf(" 500원 : %d개\n", arrCashStock[1]);
				printf(" 100원 : %d개\n", arrCashStock[2]);
				printf("  50원 : %d개\n", arrCashStock[3]);
				printf("  10원 : %d개\n", arrCashStock[4]);
				printf("==================\n");

				printf("1. 잔액 재고 변경\n2. 나가기\n");
				printf("항목 선택 : ");
				scanf_s("%d", &subMenuSelection);
				printf("\n");

				switch (subMenuSelection) {
				case 1://잔액 재고 변경
					printf("재고 변경할 화폐의 단위를 입력하시오 : ");
					scanf_s("%d", &monetaryUnit);
					if (monetaryUnit == 1000) {
						printf("변경할 재고의 수량을 입력하시오 : ");
						scanf_s("%d", arrCashStock + 0);
					}
					else if (monetaryUnit == 500) {
						printf("변경할 재고의 수량을 입력하시오 : ");
						scanf_s("%d", arrCashStock + 1);
					}
					else if (monetaryUnit == 100) {
						printf("변경할 재고의 수량을 입력하시오 : ");
						scanf_s("%d", arrCashStock + 2);
					}
					else if (monetaryUnit == 50) {
						printf("변경할 재고의 수량을 입력하시오 : ");
						scanf_s("%d", arrCashStock + 3);
					}
					else if (monetaryUnit == 10) {
						printf("변경할 재고의 수량을 입력하시오 : ");
						scanf_s("%d", arrCashStock + 4);
					}
					else {
						printf("Error : 잘못 입력하셨습니다.\n화폐 단위를 확인 후 다시 입력하십시오.\n");
					}
					break;

				case 2://나가기
					break;

				default:
					printf("Error : 잘못 입력 하셨습니다.");
					break;
				}
			}
			break;

		case 3://상품 판매
			printf("\n");
			printf("1. 판매 시작\n2. 나가기\n");
			printf("항목 선택 : ");
			scanf_s("%d", &subMenuSelection);
			printf("\n");

			switch (subMenuSelection) {
			case 1://판매 시작
				while (subMenuSelection != 2) {
					printf("\n========================================%s========================================\n\n", title);
					productCnt = 0;
					for (int i = MAXROW - 1; i >= 0; i--) {
						for (int k = MAXCOL - 1; k >= 0; k--) {
							productCnt++;
							if (arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k] == 0) {
								strcpy_s(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k], sizeof(arrProductName[(MAXROW - 1) - i][(MAXCOL - 1) - k]), "품절");
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
							printf("%9d원  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							if (k % MAXCOL == 0) { break; }
						}
						printf("\n");
					}
					printf("======================================================================================================\n");
					printf("%15s", arrCashStock[0] > 0 ? " " : "1000원권 부족");
					printf("%15s", arrCashStock[1] > 0 ? " " : "500원권 부족");
					printf("%15s", arrCashStock[2] > 0 ? " " : "100원권 부족");
					printf("%15s", arrCashStock[3] > 0 ? " " : "50원권 부족");
					printf("%15s", arrCashStock[4] > 0 ? " " : "10원권 부족");
					printf("\n======================================================================================================\n\n");

					cashStockCheck = 0;
					for (int i = 0; i < 5; i++) {
						if (arrCashStock[i] == 0) {
							cashStockCheck = 1;
							break;
						}
					}
					if (cashStockCheck) {
						printf("자판기내 잔액이 부족합니다.\n잔액 재고를 확인해 주십시오.\n\n");
						break;
					}
					if (!cashStockCheck && secondOder == 0) {
						printf("금액을 투입하여 주십시오 : ");
						scanf_s("%d", &inputMoney);
					}
					if (!cashStockCheck || secondOder > 0) {
						printf("상품번호를 입력하여 주십시오 : ");
						scanf_s("%d", &productNum);

						productRow = (productNum - 1) / 8;
						productCol = (productNum - 1) % 8;

						printf("선택하신 상품은 %s 이고 ", arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]));
						printf("가격은 %d원 입니다.\n", arrProductPrice[productRow][productCol]);

						balance = inputMoney - arrProductPrice[productRow][productCol];
						if (balance >= 0 && arrProductStock[productRow][productCol] > 0) {
							printf("투입된 금액은 %d원 이고 잔액은 %d원입니다.\n", inputMoney, balance);
							arrProductStock[productRow][productCol] -= 1;

						balanceReturnQ:
							rewind(stdin);
							printf("잔액을 반환하시겠습니까? (y/n) : ");
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
								printf("반환된 잔액은 1000원권 %d장, 500원권 %d개, 100원권 %d개, 50원권 %d개, 10원권 %d개 입니다.\n\n", cash1000, cash500, cash100, cash50, cash10);
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
								printf("Error : 잘못 입력하셨습니다.\n");
								goto balanceReturnQ;
							}
						}
						else if (arrProductStock[productRow][productCol] == 0) {
							printf("선택하신 상품의 재고가 부족합니다.\n\n");
						}
						else {
							printf("금액이 부족합니다.\n\n");
							break;
						}
					}
				}
				break;
			case 2://나가기
				break;
			}
			break;

		case 4://프로그램 종료
			printf("이용해 주셔서 감사합니다.\n");
			break;

		default:
			printf("1 ~ 3 항목 중 하나를 선택하여 주십시오.\n");
			break;
		}
	}
	return 0;
}