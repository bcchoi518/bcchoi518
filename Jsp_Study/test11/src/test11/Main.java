package test11;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person(1, "홍길동", 10);
		if (set.add(p1)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}//if
		System.out.println(set);
		
		p1.setAge(20);
		System.out.println(set + "<- p1의 age를 20으로 변경");
		
		Person p2 = new Person(2, "홍길동", 20);
		if (set.add(p2)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}//if
		System.out.println(set);
		
//		p1.setAge(10);
//		System.out.println(set + "<- p1의 age를 10으로 변경");
		
		Person p3 = new Person(3, "홍길동", 10);
		if (set.add(p3)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}//if
		
		System.out.println(set);
		
	}

}
