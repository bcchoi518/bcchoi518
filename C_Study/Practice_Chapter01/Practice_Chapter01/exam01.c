#include <stdio.h>  //stdio.h ������ exam01.c ���Ͽ� ���Խ��Ѽ� ����ϰڴ�.
//main()�� ���α׷��� �������� �ǹ��Ѵ�.
int main(void) {
	//printf() �Լ��� ǥ��(�ܼ�)����Լ��� �ǹ��Ѵ�.
	printf("�ȳ��ϼ���. C��� ���ν����մϴ�.\n");
	
	long num1 = 2147483647;
	long num2 = -2147483648ll;

	num1 = num1 + 2;
	num2 = num2 - 2;

	printf("���� �÷ο� : %d\n", num1);
	printf("��� �÷ο� : %d\n", num2);

	return 0;

}