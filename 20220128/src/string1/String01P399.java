package string1;

public class String01P399 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인
		// 1. charAt();
		String greeting = "Hello Java";
		char get = greeting.charAt(6); /// :) H1, e2, l3, l4, o5, "J6", a7, v8, a9 = 문자열 6번째의 J를 get에 저장
		System.out.println(get);
		
		// 자바는 문자열 인덱싱을 허용하지 않습니다. 
		// cf. int는 인덱싱 가능
		// cf. 파이썬은 문자열 인덱싱 허용
		// System.out.println(greeting[6]);
	}
}
