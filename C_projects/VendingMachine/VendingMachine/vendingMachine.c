#include<stdio.h>
#include<string.h>
#define MAXROW 3
#define MAXCOL 8

int main(void) {

	char title[30] = "!!BC Vending Machine!!";		// 상품 판매시 자판기 타이틀
	char menu[100] = "1. 상품 관리\n2. 잔액 관리\n3. 상품 판매\n4. 프로그램 종료";		// 자판기 관리 메뉴
	char arrProductName[MAXROW][MAXCOL][100] = { "", };		// 상품 이름 저장공간
	char arrChartemp[100] = "";		// 상품 이름과 대조해보기 위한 배열 임시 저장공간
	char balanceReturn = ' ';		// 잔돈 반환 여부를 입력받는 저장공간
	int arrProductStock[MAXROW][MAXCOL] = { 0, };		// 상품 재고 저장공간
	int arrProductPrice[MAXROW][MAXCOL] = { 0, };		// 상품 가격 저장공간
	int arrCashStock[3] = { 10,10,10 };		// 자판기내 잔액 저장 공간 ([0] : 1000, [1] : 500, [2] : 100)
	int menuSelection = 0;		// 자판기 관리 메뉴의 선택 입력을 받는 저장공간
	int subMenuSelection = 0;		// 자판기 관리 메뉴의 하위 메뉴 선택 입력을 받는 저장공간
	int productNum = 0;		// 상품 번호를 입력 받는 저장공간
	int productCnt = 0;		// 상품 번호를 표시하는 저장공간
	int productRow = 0;		// 특정 상품의 행을 표시하는 저장공간
	int productCol = 0;		// 특정 상품의 열을 표시하는 저장공간
	int monetaryUnit = 0;		// 자판기 잔액 관리 및 잔액 반환을 위해 화폐단위로 관리하는 저장공간
	int inputMoney = 0;		// 사용자가 투입하는 금액을 입력받는 저장공간
	int balance = 0;		// 잔액 저장공간
	int secondOder = 0;		// 첫번째 주문을 완료 후 재 주문시 사용되는 스위치
	int totalCashStock = 0;		// 자판기내 잔액의 총합을 표시하는 저장공간
	int cashStockCheck = 0;		// 자판기내 잔액이 충분한지 확인하는 저장공간
	int cash1000 = 0;		// 1000원권 관련 정보를 저장하는 저장공간
	int cash500 = 0;		// 500원권 관련 정보를 저장하는 저장공간
	int cash100 = 0;		// 100원권 관련 정보를 저장하는 저장공간
	int saleStatus = 0;		// 자판기 판매 상태 여부를 확인하는 저장공간
	

	while (menuSelection != 4) {		// 메뉴 선택 값이 4가 아니면 반복문 실행
		printf("%s\n", menu);		// 자판기 관리 메뉴 출력
		printf("항목 선택 : ");		// 자판기 관레 메뉴 입력을 받기 위한 안내문
		scanf_s("%d", &menuSelection);		// 자판기 관리 메뉴를 menuSelection에 입력받음
		subMenuSelection = 0;		// 자판기 관리 메뉴의 하위 메뉴 변수를 초기화 (자판기 관리 메뉴를 넘나들때 하위 메뉴 변수에 값이 있으면 오작동을 일으킴)

		switch (menuSelection) {		// 메뉴 선택 값에 따른 각 기능을 수행
		case 1:		// 상품 관리 메뉴 수행
			while (subMenuSelection != 4) {		// 하위 메뉴의 선택값이 4가 아니면 반복문 수행
				printf("\n============================================상품 재고 현황============================================\n\n");
				productCnt = 0;		// 상품 번호를 항상 1부터 출력하기 위한 초기화
				for (int i = MAXROW - 1; i >= 0; i--) {		// 자판기내 상품 진열 행의 최대값부터 감소되면서 반복문 수행
					for (int k = MAXCOL - 1; k >= 0; k--) {		// 자판기내 상품 진열 열의 최대값부터 감소되면서 반복문 수행
						productCnt++;		// 상품 번호를 1씩 증가
						if (arrProductStock[(MAXROW - 1) - i][(MAXCOL - 1) - k] == 0) {		// 가나다라마사바사아
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
					scanf_s("%s", arrChartemp, sizeof(arrChartemp));
					strcpy_s(arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]), arrChartemp);
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
				totalCashStock = (arrCashStock[0] * 1000) + (arrCashStock[1] * 500) + (arrCashStock[2] * 100);
				printf("  합계 : %d원\n", totalCashStock);
				printf("==================\n\n");

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
					cashStockCheck = 0;
					totalCashStock = (arrCashStock[0] * 1000) + (arrCashStock[1] * 500) + (arrCashStock[2] * 100);
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
						printf("투입할 금액을 입력하여 주십시오(투입 최소 단위 100원) : ");//지폐단위별로 입금받기
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
							printf("투입 최소 단위는 100원 입니다. (반환 금액 : %d)\n\n", inputMoney);
							break;
						}
					}
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
							if (arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] > inputMoney) {
								arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k] = 0;
								printf("%9d원  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							else {
								printf("%9d원  ", arrProductPrice[(MAXROW - 1) - i][(MAXCOL - 1) - k]);
							}
							if (k % MAXCOL == 0) { break; }
						}
						printf("\n");
					}
					printf("======================================================================================================\n");
					printf("%-15s", saleStatus == 1 ? "판매중" : "판매불가");
					printf("현재 잔액 : %-15d\t\t", inputMoney);
					printf("%15s", arrCashStock[0] > 0 ? " " : "1000원권 부족");
					printf("%15s", arrCashStock[1] > 0 ? " " : "500원권 부족");
					printf("%15s", arrCashStock[2] > 0 ? " " : "100원권 부족");
					printf("\n======================================================================================================\n\n");
					
					if (cashStockCheck) {
						printf("자판기내 잔액이 부족합니다.\n잔액 재고를 확인해 주십시오.\n\n");
						break;
					}
					
					if (!cashStockCheck || secondOder > 0) {
						printf("상품번호를 입력하여 주십시오 : "); 
						scanf_s("%d", &productNum);
						printf("\n");
						productRow = (productNum - 1) / 8;
						productCol = (productNum - 1) % 8;
						balance = inputMoney - arrProductPrice[productRow][productCol];

						if (!strcmp(arrProductName[productRow][productCol], "품절")) {
							printf("품절된 상품입니다.\n\n");
							goto balanceReturnQ;
						}
						else if (arrProductPrice[productRow][productCol] == 0) {
							printf("금액이 부족합니다.\n\n");
							goto balanceReturnQ;
						}
						else {
							printf("선택하신 상품은 %s 이고 ", arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]));
							printf("가격은 %d원 입니다.\n\n", arrProductPrice[productRow][productCol]);
						}
						if (balance >= 0 && arrProductStock[productRow][productCol] > 0) {
							printf("투입된 금액은 %d원 이고 잔액은 %d원입니다.\n\n", inputMoney, balance);
							arrProductStock[productRow][productCol] -= 1;

						balanceReturnQ:
							rewind(stdin);
							printf("잔액을 반환하시겠습니까? (y/n) : ");
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
									printf("자판기내 잔액 잔고가 부족합니다. 고객센터로 문의주시기 바랍니다.\n\n");
									break;
								}
								printf("반환된 잔액은 1000원권 %d장, 500원권 %d개, 100원권 %d개입니다.\n", cash1000, cash500, cash100);
								printf("이용해 주셔서 감사합니다.\n\n");
								subMenuSelection = 2;
								secondOder = 0;
								inputMoney = 0;
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