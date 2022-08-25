package testJsp;

public class Test {
	public static void main(String[] args) {
		// 밑에있는 variable v_salary number;
		int v_salary = 0;
		
		// exec :v_salary := fn_salary_ename('Steven','King');
		v_salary = fn_salary_ename("Steven", "King");
	}
	
	// create or replace function fn_salary_ename 함수를 자바느낌으로
	public static int fn_salary_ename(String v_first_name, String v_last_name) {
		// select 절에 있는 테이블에서 가지고 오는 값
		String table_first_name = "Steven";
		String table_last_name = "King";
		int table_salary = 1000;

		// 리턴값을 반환할때 담을 변수
		int v_salary = 0;
		
		if (table_first_name.equals(v_first_name) && table_last_name.equals(v_last_name)) {
			v_salary = table_salary;
		}
		return v_salary;
	}
}
