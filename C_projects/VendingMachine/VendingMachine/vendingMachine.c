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
	int secondOder = 0;		// 첫번째 주문을 완료 후 재 주문인지 확인하는 저장공간
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

		switch (menuSelection) {		// 메뉴 선택 값에 따라 각 기능을 수행
		case 1:		// 상품 관리 메뉴 수행
			while (subMenuSelection != 4) {		// 하위 메뉴의 선택값이 4가 아니면 반복문 수행
				printf("\n============================================상품 재고 현황============================================\n\n");
				productCnt = 0;		// 상품 번호를 항상 1부터 출력하기 위한 초기화
				for (int i = 0; i < MAXROW; i++) {		// 자판기내 상품 진열 행의 최대값이 될때까지 1씩 증가되면서 반복문 수행
					for (int k = 0; k < MAXCOL; k++) {		// 자판기내 상품 진열 열의 최대값이 될때까지 1씩 증가되면서 반복문 수행
						productCnt++;		// 상품 번호를 1씩 증가
						if (arrProductStock[i][k] == 0) {		// 상품 재고가 0일때 수행
							strcpy_s(arrProductName[i][k], sizeof(arrProductName[i][k]), "재고없음");		// 상품 재고가 0인 상품의 상품명은 재고없음으로 붙여넣음
							arrProductPrice[i][k] = 0;		// 상품의 재고가 0인 상품의 가격도 0원으로 초기화
							printf("%2d.%8s  ", productCnt, arrProductName[i][k]);		// 상품 번호.상품 이름 형식으로 출력
						}
						else {		// 상품 재고가 0이 아니면 수행
							printf("%2d.%8s  ", productCnt, arrProductName[i][k]);		// 상품 번호.상품 이름 형식으로 출력
						}
						if (k > 0 && k % MAXCOL == 0) { break; }		// k의 값이 0보다 크고 최대 열의 값과 같아지면 break
					}
					printf("\n");
					for (int k = 0; k < MAXCOL; k++) {		// 자판기내 상품 진열 열의 최대값이 될때까지 1씩 증가되면서 반복문 수행
						printf("%9d원  ", arrProductPrice[i][k]);		// 상품 가격을 출력
						if (k > 0 && k % MAXCOL == 0) { break; }		// k의 값이 0보다 크고 최대 열의 값과 같아지면 break
					}
					printf("\n");
					for (int k = 0; k < MAXCOL; k++) {		// 자판기내 상품 진열 열의 최대값이 될때까지 1씩 증가되면서 반복문 수행
						printf("%9d개  ", arrProductStock[i][k]);		// 상품 재고를 출력
						if (k > 0 && k % MAXCOL == 0) { break; }		// k의 값이 0보다 크고 최대 열의 값과 같아지면 break
					}
					printf("\n");
					printf("\n");
				}
				printf("======================================================================================================\n\n");

				printf("1. 상품 메뉴 변경\n2. 상품 재고 변경\n3. 상품 가격 변경\n4. 나가기\n");		// 상품 관리의 하위 메뉴 목록 출력
				printf("항목 선택 : ");		// 상품 관리의 하위 메뉴를 입력 받기 위한 안내문
				scanf_s("%d", &subMenuSelection);		// 상품 관리의 하위 메뉴를 subMenuSelection에 입력받음
				printf("\n");

				switch (subMenuSelection) {		// 하위 메뉴의 선택값에 따라 각 기능 수행
				case 1:		// 상품 메뉴 변경
					printf("변경할 상품번호를 입력하세요 : ");		// 변경할 상품 번호를 입력받기 위한 안내문
					scanf_s("%d", &productNum);		// 변경할 상품 번호를 productNum에 입력받음
					// productNum - 1 : 배열 인덱스는 0부터 시작하기 때문
					productRow = (productNum - 1) / MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 몫으로 해당 위치의 행값을 저장 
					productCol = (productNum - 1) % MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 나머지로 해당 위치의 열값을 저장

					printf("변경할 상품명을 입력하세요 : ");		// 변경할 상품명을 입력받기 위한 안내문
					scanf_s("%s", arrChartemp, sizeof(arrChartemp));		// 변경할 상품명을 arrChartemp에 입력받음
					strcpy_s(arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]), arrChartemp);		// 변경할 상품명의 위치에 입력받은 상품명을 붙여넣음
					printf("가격을 입력하세요 : ");		// 변경할 상품의 가격을 입력받기 위한 안내문
					scanf_s("%d", arrProductPrice[productRow] + productCol);		// 변경할 상품의 가격을 상품명이 변경된 위치에 입력받음
					printf("재고를 입력하세요 : ");		// 변경할 상품의 재고를 입력받기 위한 안내문
					scanf_s("%d", arrProductStock[productRow] + productCol);		// 변경할 상품의 재고를 상품명이 변경된 위치에 입력받음
					break;		// case 1:(상품 메뉴 변경)의 break

				case 2:		// 상품 재고 변경
					printf("변경할 상품번호를 입력하세요 : ");		// 변경할 상품 번호를 입력받기 위한 안내문
					scanf_s("%d", &productNum);		// 변경할 상품 번호를 productNum에 입력받음

					productRow = (productNum - 1) / MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 몫으로 해당 위치의 행값을 저장
					productCol = (productNum - 1) % MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 나머지로 해당 위치의 열값을 저장

					if (!strcmp(arrProductName[productRow][productCol], "재고없음")) {		// 변경할 상품 번호 위치에 상품명이 재고없음과 같으면 수행
						printf("상품이 등록되지 않았습니다.\n\n");		// 변경할 상품 번호 위치에 상품이 등록되지 않았다는 안내문
					}
					else {		// 변경할 상품 번호 위치에 상품명이 재고없음과 다르면 수행
						printf("수량를 입력하세요 : ");		// 변경할 상품 번호 위치에 상품의 재고를 입력받기 위한 안내문
						scanf_s("%d", arrProductStock[productRow] + productCol);		// 변경할 상품 번호 위치에 상품의 변경된 재고를 입력받음
					}
					break;		// case 2:(상품 재고 변경)의 break

				case 3:		// 상품 가격 변경
					printf("변경할 상품번호를 입력하세요 : ");		// 변경할 상품 번호를 입력받기 위한 안내문
					scanf_s("%d", &productNum);		// 변경할 상품 번호를 productNum에 입력받음

					productRow = (productNum - 1) / MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 몫으로 해당 위치의 행값을 저장
					productCol = (productNum - 1) % MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 나머지로 해당 위치의 열값을 저장

					if (!strcmp(arrProductName[productRow][productCol], "재고없음")) {		// 변경할 상품 번호 위치에 상품명이 재고없음과 같으면 수행
						printf("상품이 등록되지 않았습니다.\n\n");		// 변경할 상품 번호 위치에 상품이 등록되지 않았다는 안내문
					}
					else {		// 변경할 상품 번호 위치에 상품명이 재고없음과 다르면 수행
						printf("가격를 입력하세요 : ");		// 변경할 상품 번호 위치에 상품의 가격을 입력받기 위한 안내문
						scanf_s("%d", arrProductPrice[productRow] + productCol);		// 변경할 상품 번호 위치에 상품의 변경된 가격을 입력받음
					}
					break;		// case 3:(상품 가격 변경)의 break

				case 4:		// 나가기
					break;		// case 4:(나가기)의 break

				default:		// 메뉴 선택을 잘못 했을 경우 수행
					printf("Error : 잘못 입력하셨습니다.\n1 ~ 4 항목 중 하나를 선택하십시오.\n");		// 에러 메시지 출력
					break;		// default: 의 break
				}
			}
			break;		// case 1:(상품 관리)의 break

		case 2:		// 잔액 관리
			while (subMenuSelection != 2) {		// 하위 메뉴의 선택값이 2가 아니면 반복문 수행
				printf("\n==잔액 재고 현황==\n");		// 잔액 재고 현황 타이틀 출력
				printf("1000원 : %d장\n", arrCashStock[0]);		// 1000원 재고 출력
				printf(" 500원 : %d개\n", arrCashStock[1]);		// 500원 재고 출력
				printf(" 100원 : %d개\n", arrCashStock[2]);		// 100원 재고 출력
				totalCashStock = (arrCashStock[0] * 1000) + (arrCashStock[1] * 500) + (arrCashStock[2] * 100);		// 잔액 재고의 총 합계를 계산하여 totalCashStock에 저장
				printf("  합계 : %d원\n", totalCashStock);		// 잔액 재고의 총 합계 출력
				printf("==================\n\n");

				printf("1. 잔액 재고 변경\n2. 나가기\n");		// 잔액 관리의 하위 메뉴 목록 출력
				printf("항목 선택 : ");		// 잔액 관리의 하위 메뉴를 입력 받기 위한 안내문
				scanf_s("%d", &subMenuSelection);		// 잔액 관리의 하위 메뉴 선택을 subMenuSelection에 입력받음
				printf("\n");

				switch (subMenuSelection) {		// 하위 메뉴의 선택값에 따라 각 기능 수행
				case 1:		// 잔액 재고 변경
					printf("재고 변경할 화폐의 단위를 입력하시오 : ");		// 재고 변경할 화폐의 단위 입력을 받기 위한 안내문
					scanf_s("%d", &monetaryUnit);		// 재고 변경할 화폐의 단위를 monetaryUnit에 입력받음
					if (monetaryUnit == 1000) {		// 재고 변경할 화폐의 단위가 1000 이면 수행
						printf("변경할 재고의 수량을 입력하시오 : ");		// 재고 변경할 화폐 재고의 수량을 입력받기 위한 안내문
						scanf_s("%d", arrCashStock + 0);		// 재고 변경할 화폐를 arrCashStock의 0번째 인덱스에 입력받음
					}
					else if (monetaryUnit == 500) {		// 재고 변경할 화폐의 단위가 500 이면 수행
						printf("변경할 재고의 수량을 입력하시오 : ");		// 재고 변경할 화폐 재고의 수량을 입력받기 위한 안내문
						scanf_s("%d", arrCashStock + 1);		// 재고 변경할 화폐를 arrCashStock의 1번째 인덱스에 입력받음
					}
					else if (monetaryUnit == 100) {		// 재고 변경할 화폐의 단위가 100 이면 수행
						printf("변경할 재고의 수량을 입력하시오 : ");		// 재고 변경할 화폐 재고의 수량을 입력받기 위한 안내문
						scanf_s("%d", arrCashStock + 2);		// 재고 변경할 화폐를 arrCashStock의 2번째 인덱스에 입력받음
					}
					else {		// 재고 변경할 화폐의 단위가 1000, 500, 100, 이 아니면 수행
						printf("Error : 잘못 입력하셨습니다.\n화폐 단위를 확인 후 다시 입력하십시오.\n");		// 에러 메시지 출력
					}
					break;		// Case 1:(잔액 재고 변경)의 break

				case 2:		//	나가기
					break;		// Case 2:(나가기)의 break

				default:		// 메뉴 선택을 잘못 했을 경우 수행
					printf("Error : 잘못 입력 하셨습니다.");		// 에러 메시지 출력
					break;		// default: 의 break
				}
			}
			break;		// Case 2:(잔액 관리)의 break;

		case 3:	// 상품 판매
			while (1) {		// 상품 판매 기능 반복문 수행
				totalCashStock = (arrCashStock[0] * 1000) + (arrCashStock[1] * 500) + (arrCashStock[2] * 100);		// 잔액 재고의 총 합계를 계산하여 totalCashStock에 저장
				if (totalCashStock == 0) {		// 잔액 재고의 총 합계가 0원이면 수행
					printf("Error : 자판기내 잔액이 부족합니다.\n잔액 재고를 확인해 주십시오.\n\n");		// 에러 메시지 출력
					break;		// 잔액 부족으로 판매를 할 수 없음으로 판매 기능 반복문 break
				}
				else {		// 잔액 재고의 총 합계가 0이 아니면 수행
					saleStatus = 1;		// 자판기의 판매 상태 여부를 확인하는 변수에 1을 저장
				}
				if (secondOder == 0) {		// 잔액 재고를 확인하는 변수가 0이고 첫번째 주문이면 수행
					printf("투입할 금액을 입력하여 주십시오(투입 최소 단위 100원) : ");		// 사용자로부터 투입 금액을 입력받기 위한 안내문(최소 투입 금액 단위가 100원)
					scanf_s("%d", &inputMoney);		// 사용자로부터 투입 금액을 inputMoney에 입력받음
					if (inputMoney >= 100 && inputMoney % 100 == 0) {		// 입력받은 투입 금액이 100원 보다 크고 100으로 나눈 나머지가 0이면 수행
						balance = inputMoney;		// 잔액 관리 변수에 입력받은 투입 금액을 저장
						cash1000 = balance / 1000;		// 잔액을 1000으로 나눈 몫을 cash1000에 저장
						arrCashStock[0] += cash1000;		// 1000원권 재고 arrCashStock[0]에 cash1000값을 더하여 업데이트
						balance %= 1000;		// 잔액을 1000으로 나눈 나머지를 잔액 관리 변수에 업데이트
						cash500 = balance / 500;		// 잔액을 500으로 나눈 몫을 cash500에 저장
						arrCashStock[1] += cash500;		// 500원권 재고 arrCashStock[1]에 cash500값을 더하여 업데이트
						balance %= 500;		// 잔액을 500으로 나눈 나머지를 잔액 관리 변수에 업데이트
						cash100 = balance / 100;		// 잔액을 100으로 나눈 몫을 cash100에 저장
						arrCashStock[2] += cash100;		// 100원권 재고 arrCashStock[2]에 cash100값을 더하여 업데이트
					}
					else {		// 입력받은 투입 금액이 최소 투입 금액 단위인 100원 보다 작으면 수행
						printf("투입 최소 단위는 100원 입니다. (반환 금액 : %d)\n\n", inputMoney);		// 투입 최소 단위를 안내해주고 입력받은 금액을 반환
						break;		// 금액을 반환함으로 판매 기능 반복문 break
					}
				}
				printf("\n========================================%s========================================\n\n", title);		// 자판기 타이틀 출력
				productCnt = 0;		// 상품 번호를 항상 1부터 출력하기 위한 초기화
				for (int i = 0; i < MAXROW; i++) {		// 자판기내 상품 진열 행의 최대값이 될때까지 1씩 증가되면서 반복문 수행
					for (int k = 0; k < MAXCOL; k++) {		// 자판기내 상품 진열 열의 최대값이 될때까지 1씩 증가되면서 반복문 수행
						productCnt++;		// 상품 번호를 1씩 증가
						if (arrProductStock[i][k] == 0) {		// 상품 재고가 0일때 수행
							strcpy_s(arrProductName[i][k], sizeof(arrProductName[i][k]), "품절");		// 상품 재고가 0인 상품의 상품명은 품절로 붙여넣음
							arrProductPrice[i][k] = 0;		// 상품의 재고가 0인 상품의 가격도 0원으로 초기화
							printf("%2d.%8s  ", productCnt, arrProductName[i][k]);		// 상품 번호.상품 이름 형식으로 출력
						}
						else {		// 상품 재고가 0이 아니면 수행
							printf("%2d.%8s  ", productCnt, arrProductName[i][k]);		// 상품 번호.상품 이름 형식으로 출력
						}
						if (k > 0 && k % MAXCOL == 0) { break; }		// k의 값이 0보다 크고 최대 열의 값과 같아지면 break
					}
					printf("\n");
					for (int k = 0; k < MAXCOL; k++) {		// 자판기내 상품 진열 열의 최대값이 될때까지 1씩 증가되면서 반복문 수행
						if (arrProductPrice[i][k] > inputMoney) {		// 자판기내 진열된 상품의 가격이 투입 금액보다 크면 수행
							arrProductPrice[i][k] = 0;		// 자판기내 진열된 상품의 가격이 투입금액 보다 크면 0원으로 표시
							printf("%9d원  ", arrProductPrice[i][k]);		// 상품 가격을 출력
						}
						else {		// 자판기내 진열된 상품의 가격이 투입 금액보다 작으면 수행
							printf("%9d원  ", arrProductPrice[i][k]);		// 상품 가격을 출력
						}
						if (k > 0 && k % MAXCOL == 0) { break; }		// k의 값이 0보다 크고 최대 열의 값과 같아지면 break
					}
					printf("\n");
					printf("\n");
				}
				printf("======================================================================================================\n");
				printf("%-15s", saleStatus == 1 ? "판매중" : "판매불가");		// 자판기의 판매 상태 여부를 확인하는 변수가 1이면 판매중을 출력, 0이면 판매불가를 출력
				printf("현재 잔액 : %-15d\t\t", inputMoney);		// 사용자가 입력한 투입 금액을 현재 잔액으로 표시(재 주문일때는 계산된 잔액을 표시)
				printf("%15s", arrCashStock[0] > 0 ? " " : "1000원권 부족");		// 자판기내 1000원권 재고가 0보다 크지 않으면 1000원권 부족 표시
				printf("%15s", arrCashStock[1] > 0 ? " " : "500원권 부족");		// 자판기내 500원권 재고가 0보다 크지 않으면 500원권 부족 표시
				printf("%15s", arrCashStock[2] > 0 ? " " : "100원권 부족");		// 자판기내 100원권 재고가 0보다 크지 않으면 100원권 부족 표시
				printf("\n======================================================================================================\n\n");
				
				printf("※투입된 금액이 상품의 가격보다 적을 경우 해당 상품의 가격이 0원으로 표시됩니다.※\n");		// 투입된 금액이 상품 가격보다 적을 경우 안내 메시지 출력
				printf("상품번호를 입력하여 주십시오 : ");		// 상품 번호를 입력받기 위한 안내문
				scanf_s("%d", &productNum);		// 상품 번호를 inputMoney에 입력받음
				printf("\n");
				productRow = (productNum - 1) / MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 몫으로 해당 위치의 행값을 저장
				productCol = (productNum - 1) % MAXCOL;		// 입력받은 상품 번호를 진열 열의 최대값으로 나눈 나머지로 해당 위치의 열값을 저장
				balance = inputMoney - arrProductPrice[productRow][productCol];		// 투입된 금액에서 입력받은 상품 번호의 가격을 뺀 값을 잔액 변수에 저장

				if (!strcmp(arrProductName[productRow][productCol], "품절")) {		// 입력받은 상품 번호 위치에 상품명이 품절과 같으면 수행
					printf("품절된 상품입니다.\n\n");		// 품절 안내 메시지 출력
					goto balanceReturnQ;		// 잔액 반환 질문 위치로 이동
				}
				else if (arrProductPrice[productRow][productCol] == 0) {		// 입력받은 상품의 번호 위치에 상품명이 품절이 아니지만 금액이 0원이면 수행
					printf("금액이 부족합니다.\n\n");		// 금액 부족 안내 메시지 출력
					goto balanceReturnQ;		// 잔액 반환 질문 위치로 이동
				}
				else {		// 입력받은 상품 번호 위치에 상품명이 품절이 아니고 금액이 0원이 아니면 수행
					printf("선택하신 상품은 %s 이고 ", arrProductName[productRow][productCol], sizeof(arrProductName[productRow][productCol]));		// 입력받은 상품 번호 위치의 상품명 출력
					printf("가격은 %d원 입니다.\n\n", arrProductPrice[productRow][productCol]);		// 입력받은 상품 번호 위치의 상품 가격 출력
					arrProductStock[productRow][productCol] -= 1;		// 입력받은 상품 번호 위치의 재고를 1 감소시킨 후 재고 수량 업데이트
				}
				printf("투입된 금액은 %d원 이고 잔액은 %d원입니다.\n\n", inputMoney, balance);		// 투입 금액과 상품 결제 후 잔액 안내 메시지 출력
					
				balanceReturnQ:		// 잔액 반환 질문 위치(goto문 목적지)
				rewind(stdin);		// 입력 버퍼 비우기(오작동 방지)
				printf("잔액을 반환하시겠습니까? (y/n) : ");		// 잔액 반환 안내 메시지 출력
				scanf_s("%c", &balanceReturn, sizeof(balanceReturn));		// 잔액 반환 의사 여부를 balanceReturn에 입력받음
				if (balanceReturn == 'Y' || balanceReturn == 'y') {		// 잔액 반환을 선택할 경우 수행
					if (balance / 1000 < arrCashStock[0]) {		// 잔액을 1000으로 나눈 몫이 1000원권 잔액 재고보다 작으면 수행
						cash1000 = balance / 1000;		// 잔액을 1000으로 나눈 몫을 cash1000에 저장
						arrCashStock[0] -= cash1000;		// 1000원권 재고 arrCashStock[0]에 cash1000값을 뺀 후 업데이트
						balance %= 1000;		// 잔액을 1000으로 나눈 나머지를 잔액 관리 변수에 저장
						}
					if (balance / 500 < arrCashStock[1]) {		// 잔액을 500으로 나눈 몫이 500원권 잔액 재고보다 작으면 수행
						cash500 = balance / 500;		// 잔액을 500으로 나눈 몫을 cash500에 저장
						arrCashStock[1] -= cash500;		// 500원권 재고 arrCashStock[1]에 cash500값을 뺀 후 업데이트
						balance %= 500;		// 잔액을 500으로 나눈 나머지를 잔액 관리 변수에 저장
					}
					if (balance / 100 < arrCashStock[2]) {		// 잔액을 100으로 나눈 몫이 100원권 잔액 재고보다 작으면 수행
						cash100 = balance / 100;		// 잔액을 100으로 나눈 몫을 cash100에 저장
						arrCashStock[2] -= cash100;		// 100원권 재고 arrCashStock[2]에 cash100값을 뺀 후 업데이트
						balance %= 100;		// 잔액을 100으로 나눈 나머지를 잔액 관리 변수에 저장
					}
					if (balance > 0) {		// 위 if 문을 다 확인 한 후에도 잔액이 0보다 크면 수행
						printf("자판기내 잔액 잔고가 부족합니다. 고객센터로 문의주시기 바랍니다.\n\n");		// 자판기내 잔액 잔고 부족 안내 메시지 출력
						break;		// 자판기내 잔액 잔고 부족으로 판매 기능 반복문 종료
					}
					printf("반환된 잔액은 1000원권 %d장, 500원권 %d개, 100원권 %d개입니다.\n", cash1000, cash500, cash100);		// 반환된 잔액 안내문 출력
					printf("이용해 주셔서 감사합니다.\n\n");		// 굿바이 메시지 출력
					secondOder = 0;		// 자판기 이용이 끝났음으로 재 구매 확인 변수 초기화
					inputMoney = 0;		// 자판기 이용이 끝났음으로 투입 금액 초기화
					break;		// 자판기 이용이 끝났음으로 판매 기능 반복문 종료
				}
				else if (balanceReturn == 'N' || balanceReturn == 'n') {		// 잔액 반환을 선택하지 않은 경우 수행
					inputMoney = balance;		// 잔액 반환을 하지 않았음으로 상품 결제 후 남은 잔액을 투입 금액 변수에 넣고 현재 잔액으로 저장
					secondOder = 1;		// 잔액 반환을 하지 않았음으로 재 구매 확인 변수에 1을 대입
				}
				else {		// 잔액 반환 의사 여부를 잘못 선택했을 경우 출력
					printf("Error : 잘못 입력하셨습니다.\n");		// 에러 메시지 출력
					goto balanceReturnQ;		// 잔액 반환 질문 위치로 이동
				}
			}
		break;		// Case 3:(판매 관리) 의 break

		case 4:		// 프로그램 종료
			printf("프로그램을 종료합니다.\n");		// 프로그램 종료 메시지 출력
			break;		// Caes 4:(프로그램 종료) 의 break

		default:		// 메뉴 선택을 잘못 했을 경우 수행
			printf("Error : 잘못 입력하셨습니다. \n1 ~ 4 항목 중 하나를 선택하여 주십시오.\n");		// 에러 메시지 출력
			break;		// default: 의 break
		}
	}
	return 0;
}