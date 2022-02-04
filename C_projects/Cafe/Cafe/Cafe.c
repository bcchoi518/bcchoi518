#include <stdio.h>
#include <string.h>

int main(void) {
	char title[20] = "♨DS Cafe♨";
	char menu[100] = "①추가하기\n②수정하기\n③검색하기\n④삭제하기\n⑤목록보기\n⑥나가기";
	//메뉴 이름, 메뉴 가격
	char arName[200][100] = { "", };				// 100바이트 크기의 메뉴이름을 적을 수 있는 행을 200개 선언 (200가지 메뉴를 담을수있음)
	char temp[100] = "";									// 입력받은 값을 기존값과 비교하여 검사하기 위한 저장공간
	int arPrice[200] = { 0, };							// 상품 가격을 저장하기 위한 저장공간
	int choice = 0;											// 수행할 기능에 해당하는 번호를 입력받기 위한 저장공간
	int cnt = 0;												// 상품을 추가/삭제 할때 마다 증감하여 상품의 갯수 파악을 위한 저장공간
	int isDup = 0;											//	상품의 추가/수정/삭제/조회 등 기능을 수행할때 중복 여부를 확인하기 위한 스위치
	int foundIdx = 0;										// 상품 수정시 해당 상품의 위치 파악을 위한 저장공간

	while (1) {
		printf("%s\n%s\n", title, menu);				// 타이틀과 메뉴(기능) 항목을 출력
		printf("수행할 항목 선택 : ");						// 사용자로부터 입력받기 위한 안내 메시지
		scanf_s("%d", &choice);							//	사용자로부터 입력받은 값을 choice 변수에 저장
		if (choice == 6) {									// 사용자로부터 입력받은 값이 6이면 while 반복문을 break하고 종료
			printf("프로그램을 종료합니다.\n");
			break;
		}
		switch (choice) {									// 사용자로부터 입력받은 값에 따라 해당 기능 수행
		case 1:													// 상품 추가하기
			printf("추가하실 상품명 : ");
			scanf_s("%s", temp, sizeof(temp));
			isDup = 0;											//	추가할 상품명을 기존 상품목록(arName[])과 비교하고 해당 상품의 중복확인을 위한 스위치값 초기화
			for (int i = 0; i < cnt; i++) {				// 추가된 상품의 갯수(cnt) 만큼 반복문을 실행
				if (!strcmp(temp, arName[i])) {		// 추가할 상품명과 기존 상품목록의 상품명이 일치한다면 수행
					isDup = 1;									// 중복확인을 위한 스위치값 활성화
					break;										//	추가할 상품과 기존 상품이 중복되어 더이상 검사할 필요가 없으므로 break
				}
			}
			if (!isDup) {										// 중복확인 후 중복되는 상품이 없을 경우 수행
				printf("추가하실 상품의 가격 : ");
				scanf_s("%d", arPrice + cnt);			// 추가할 상품의 가격을 arPrice에 저장
				strcpy_s(arName[cnt], sizeof(arName[cnt]), temp);	// 중복확인을 위해 임시저장했던 temp의 상품명을 기존 상품명 저장공간으로 복사
				cnt++;											// 상품을 추가할때마다 cnt 값을 증가시켜 상품의 갯수 업데이트
			}
			else {
				printf("이미 존재하는 상품입니다.\n");// 추가할 상품과 기존 상품이 중복될때 수행
			}
			break;
		case 2://수정하기
			printf("수정하실 기존 상품명 : ");
			scanf_s("%s", temp, sizeof(temp));		// 수정할 상품명을 temp 저장공간에 저장 
			isDup = 0;											// 중복확인을 위한 스위치값 초기화
			for (int i = 0; i < cnt; i++) {				// 기존 상품명을 수정하기 위해 수정할 대상을 찾기위한 반복문
				if (!strcmp(temp, arName[i])) {		// 수정할 상품명과 기존 상품명이 일치한다면 수행
					isDup = 1;									// 중복확인을 위한 스위치값 활성화
					foundIdx = i;								//	수정할 상품명과 기존 상품명이 일치하는 위치의 인덱스 값을 저장
					break;
				}
			}
			if (isDup) {
				printf("수정하실 새로운 상품명 : ");
				scanf_s("%s", temp, sizeof(temp));	// 수정을 위한 새로운 상품명을 temp 저장공간에 저장
				isDup = 0;										// 중복확인을 위한 스위치값 초기화
				for (int i = 0; i < cnt; i++) {			// 수정을 위한 새로운 상품명이 기존 상품명과 중복되는지 확인하기 위한 반복문
					if (!strcmp(temp, arName[i])) {	// 수정을 위한 새로운 상품명이 기존 상품명과 중복된다면 수행
						isDup = 1;								// 중복확인을 위한 스위치값 활성화
						break;
					}
				}
				if (!isDup) {									// 수정을 위한 새로운 상품명이 기존 상품명과 중복되지 않는다면 수행
					printf("상품 가격 : ");
					scanf_s("%d", arPrice + foundIdx);// 수정할 위치(인덱스)의 상품명과 같은 위치(인덱스)에 새로운 가격을 저장
					strcpy_s(arName[foundIdx], sizeof(arName[foundIdx]), temp);// 수정할 위치(인덱스)의 상품명과 같은 위치(인덱스)에 새로운 상품명을 저장
				}
				else {
					printf("이미 존재하는 상품입니다.\n");// 수정을 위한 새로운 상품명이 기존 상품명과 중복될때 수행
				}
			}
			else {
				printf("수정할 상품이 존재하지 않습니다.\n");// 수정할 상품명이 기존 상품명과 중복되지 않을때 수행
			}
			break;
		case 3://검색하기
			printf("검색하실 상품명 입력 : ");
			scanf_s("%s", temp, sizeof(temp));		// 검색할 상품명을 temp 저장공간에 저장
			isDup = 0;											//	중복확인을 위한 스위치값 초기화
			for (int i = 0; i < cnt; i++) {				//	검색할 상품명과 기존 상품명이 일치하는지 확인을 위한 반복문
				if (!strcmp(temp, arName[i])) {		// 검색할 상품명과 기존 상품명이 일치한다면 수행
					printf("%s(%d원)\n", arName[i], arPrice[i]);// 검색할 상품명과 기존 상품명이 일치하는 순간의 i값에 대한 상품명과 가격 출력
					isDup = 1;									// 중복확인을 위한 스위치값 활성화
					break;										// 검색할 상품명이 기존 상품명과 일치하여 더이상 반복할 필요가 없으므로 break
				}
			}
			if (!isDup) {										//	검색할 상품명의 중복확인을 위한 반복문이 종료되어도 중복확인을 위한 스위치값이 활성화 되지 않았다면 수행
				printf("검색하신 상품이 존재하지 않습니다\n");
			}
			break;
		case 4:													//삭제하기
			printf("삭제할 상품명 입력 : ");
			scanf_s("%s", temp, sizeof(temp));		// 삭제할 상품명을 temp 저장공간에 저장
			isDup = 0;											//	중복확인을 위한 스위치값 초기화
			for (int i = 0; i < cnt; i++) {				// 삭제할 상품명과 기존 상품명이 일치하는지 확인을 위한 반복문
				if (!strcmp(temp, arName[i])) {		// 삭제할 상품명과 기존 상품명이 일치한다면 수행
					isDup = 1;									//	중복확인을 위한 스위치값 활성화
					foundIdx = i;								// 삭제할 상품명과 기존 상품명이 일치하는 위치의 인덱스 값을 저장
					break;										// 삭제할 상품명이 기존 상품명과 일치하여 더이상 반복할 필요가 없으므로 break
				}
			}
			if (isDup) {										// 삭제할 상품명이 기존 상품명과 중복되면 수행
				for (int i = foundIdx; i < cnt; i++) {// 삭제할 상품명을 삭제하기 위해 해당 위치의 인덱스값부터 추가되어있는 목록 끝부분까지 반복되는 반복문
					if (i == 199) {							// 삭제할 상품명의 인덱스가 가장 마지막 위치라면 수행
						strcpy_s(arName[i], sizeof(arName[i]), "");// 삭제할 상품명의 인덱스가 가장 마지막 위치이기 때문에 i + 1 위치가 존재하지 않아 빈값으로 초기화
					}
					else {										// 삭제할 상품명의 해당 인덱스가 가장 마지막이 아니라면 수행
						strcpy_s(arName[i], sizeof(arName[i]), arName[i + 1]);// 삭제할 상품명의 인덱스 위치의 바로 뒤 값을 앞으로 덮어쓰기하여 삭제할 상품명을 삭제
					}
				}
				cnt--;											// 상품 목록에서 상품을 삭제함으로 상품의 갯수를 파악하는 cnt 값을 감소시켜 상품의 갯수 업데이트
			}
			else {												// 삭제할 상품명과 기존 상품명이 일치하는지 검사하는 반복문이 종료되어도 중복확인을 위한 스위치값이 활성화되지 않았다면 수행
				printf("삭제하실 상품이 존재하지 않습니다.\n");
			}
			break;
		case 5:													// 목록보기
			printf("상품명(가격)\n");						// 목록보기에서 출력할 양식 안내
			for (int i = 0; i < cnt; i++) {				// 상품 목록을 출력하기 위한 반복문
				printf("%s(%d원)\n", arName[i], arPrice[i]);// 안내한 양식에 따라 출력되는 상품 목록
			}
			if (cnt == 0) {									// 상품의 갯수 파악을 위한 cnt 값이 0이 라면 수행
				printf("상품 없음\n");
			}
			break;
		}
		printf("\n");											// 반복 수행될때 타이틀과 메뉴(항목)의 가독성을 위한 개행
	}
	return 0;
}