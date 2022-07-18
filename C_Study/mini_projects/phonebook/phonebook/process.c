#include "baseHeader.h"

FILE* rfp;
char buff[100] = "";

//전화번호 리스트 출력
void phone_book_list() {

	int line_no = 0;

	fopen_s(&rfp, FILE_PATH, "r");

	if (rfp == NULL) {
		printf("저장된 연락처가 없습니다 !!\n\n");
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

//전화번호 리스트 등록
void phone_book_add() {
	typedef struct phone_book {
		char name[20];
		int age;
		char hp[14];
	}phone_book;

	phone_book pb = { "", 0, "" };

	printf("이름을 입력 ==> ");
	scanf_s("%s", pb.name, sizeof(pb.name));
	printf("나이를 입력 ==> ");
	scanf_s("%d", &pb.age);
	printf("전화번호를 입력 ==> ");
	scanf_s("%s", pb.hp, sizeof(pb.hp));

	fopen_s(&rfp, FILE_PATH, "a");
	fprintf(rfp, "%s\t%d\t%s\n", pb.name, pb.age, pb.hp);
	fclose(rfp);
}

//전화번호 리스트 삭제
void phone_book_remove() {

	FILE* wfp;
	int remove_no = 0;
	char read_str[50][200] = { {"",} };
	int count = 0;

	phone_book_list();

	fopen_s(&rfp, FILE_PATH, "r");

	if (rfp == NULL) {
		printf("삭제할 연락처가 없습니다 !!\n\n");
		return 0;
	}

	printf("삭제할 연락처의 번호를 입력하세요 : ");
	scanf_s("%d", &remove_no);

	for (int i = 0; i < 50; i++) {
		fgets(buff, 200, rfp);

		if (i + 1 != remove_no) {
			strcpy_s(read_str[i], 200, buff);
			count++;
		}
		else {
			printf("%d 행이 삭제되었습니다.\n", remove_no);
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