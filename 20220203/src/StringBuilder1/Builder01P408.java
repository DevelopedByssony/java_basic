package StringBuilder1;

public class Builder01P408 {

	public static void main(String[] args) {
		// StringBuilder는 String클래스와의 로직차이로 인해
		// 속도 개선이 되었습니다. 일부 기능은 String과 겹칩니다.
		StringBuilder a = new StringBuilder("adfee");
		System.out.println(a);
		// 2번 이후 모든 자료를 다 칸 씩 뒤로 밀고 확보된 공간에 "인서트" 입력
		a.insert(2, "인서트"); /* 새치기 로직, 자료 구조 배울 때 많이 나옴! */
		System.out.println(a);
	}
}
