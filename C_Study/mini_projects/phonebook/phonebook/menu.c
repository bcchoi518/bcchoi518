#include "baseHeader.h"

void menu() {
	int menu_val = 0;

	printf("�Ʒ��� �޴��� �ϳ��� ������ �ּ���\n");
	printf("1. ����ó ���\n");
	printf("2. ����ó ���\n");
	printf("3. ����ó ����\n");
	printf("4. ���α׷� ����\n");
	printf("�޴� : ");
	scanf_s("%d", &menu_val);

	switch (menu_val) {
	case 1:
		printf("		����ó ���\n");
		phone_book_list();
		break;
	case 2:
		printf("		����ó ���\n");
		phone_book_add();
		break;
	case 3:
		printf("		����ó ����\n");
		phone_book_remove();
		break;
	case 4:
		printf("		���α׷��� ����˴ϴ�!\n");
		return 0;
		break;
	default:
		printf("�߸��� �޴��� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.\n");
		break;
	}
	if (menu_val != 4)menu();
}