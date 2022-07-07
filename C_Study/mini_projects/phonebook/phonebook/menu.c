#include "baseHeader.h"

void menu() {
	int menu_val = 0;

	printf("아래의 메뉴중 하나를 선택해 주세요\n");
	printf("1. 연락처 출력\n");
	printf("2. 연락처 등록\n");
	printf("3. 연락처 삭제\n");
	printf("4. 프로그램 종료\n");
	printf("메뉴 : ");
	scanf_s("%d", &menu_val);

	switch (menu_val) {
	case 1:
		printf("		연락처 출력\n");
		phone_book_list();
		break;
	case 2:
		printf("		연락처 등록\n");
		phone_book_add();
		break;
	case 3:
		printf("		연락처 삭제\n");
		phone_book_remove();
		break;
	case 4:
		printf("		프로그램이 종료됩니다!\n");
		return 0;
		break;
	default:
		printf("잘못된 메뉴를 입력하셨습니다. 다시 입력해 주세요.\n");
		break;
	}
	if (menu_val != 4)menu();
}