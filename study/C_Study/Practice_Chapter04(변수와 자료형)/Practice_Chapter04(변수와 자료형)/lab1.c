// ����1
// ����ڷκ��� �ʸ� �Է¹޾Ƽ� �ð�, ��, �ʷ� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
// #define SECS_PER_MIN 60     <-- ��ȣ ����� �̿��Ѵ�. (��)
// #define SECS_PER_HOUR 3600  <-- ��ȣ ����� �̿��Ѵ�. (�ð�)
// 
// ������
// �ʸ� �Է����ּ��� : 3600
// 1hours, 0minutes, 0seconds
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�....
//----------------------------------------------------------------------------------

//#include <stdio.h>
//#define SECS_PER_MIN 60
//#define SECS_PER_HOUR 3600
//
//int main(void) {
//
//	int hour = 0, min_in = 0, min_out = 0, sec_in = 0, sec_out = 0;
//
//	printf("�ʸ� �Է����ּ��� : ");
//	scanf_s("%d", &sec_in);
//
//	hour = sec_in / SECS_PER_HOUR;
//	printf("hours = %d \n", hour);
//	min_in = sec_in / SECS_PER_MIN;
//	printf("min_in = %d \n", min_in);
//	min_out = min_in % SECS_PER_MIN;
//	printf("min_out = %d \n", min_out);
//	sec_out = sec_in % SECS_PER_MIN;
//	printf("sec_out = %d \n", sec_out);
//
//	printf("%d hours, %d minutes, %d seconds \n", hour, min_out, sec_out);
//
//
//	return 0;
//}