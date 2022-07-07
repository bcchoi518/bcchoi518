#include "baseHeader.h"

FILE* rfp;
char buff[100] = "";

//��ȭ��ȣ ����Ʈ ���
void phone_book_list() {

	int line_no = 0;

	fopen_s(&rfp, FILE_PATH, "r");

	if (rfp == NULL) {
		printf("����� ����ó�� �����ϴ� !!\n\n");
		return 0;
	}//end if

	for (int i = 0; i < 50; i++) {
		fgets(buff, 200, rfp);
		if (feof(rfp)) {
			break;
		}//end if
		printf("%d. %s", ++line_no, buff);
	}//end for
	printf("\n");
	fclose(rfp);
}

//��ȭ��ȣ ����Ʈ ���
void phone_book_add() {
	typedef struct phone_book {
		char name[20];
		int age;
		char hp[14];
	}phone_book;

	phone_book pb = { "", 0, "" };

	printf("�̸��� �Է� ==> ");
	scanf_s("%s", pb.name, sizeof(pb.name));
	printf("���̸� �Է� ==> ");
	scanf_s("%d", &pb.age);
	printf("��ȭ��ȣ�� �Է� ==> ");
	scanf_s("%s", pb.hp, sizeof(pb.hp));

	fopen_s(&rfp, FILE_PATH, "a");
	fprintf(rfp, "%s\t%d\t%s\n", pb.name, pb.age, pb.hp);
	fclose(rfp);
}

//��ȭ��ȣ ����Ʈ ����
void phone_book_remove() {

	FILE* wfp;
	int remove_no = 0;
	char read_str[50][200] = { {"",} };
	int count = 0;

	phone_book_list();

	fopen_s(&rfp, FILE_PATH, "r");

	if (rfp == NULL) {
		printf("������ ����ó�� �����ϴ� !!\n\n");
		return 0;
	}

	printf("������ ����ó�� ��ȣ�� �Է��ϼ��� : ");
	scanf_s("%d", &remove_no);

	for (int i = 0; i < 50; i++) {
		fgets(buff, 200, rfp);

		if (i + 1 != remove_no) {
			strcpy_s(read_str[i], 200, buff);
			count++;
		}
		else {
			printf("%d ���� �����Ǿ����ϴ�.\n", remove_no);
		}
		if (feof(rfp)) {
			break;
		}
	}
	fclose(rfp);

	fopen_s(&wfp, FILE_PATH, "w");

	for (int i = 0; i < count; i++) {
		fputs(read_str[i], wfp);
	}
	fclose(wfp);

	printf("\n");
}