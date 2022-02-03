package StringBuilder1;

public class Buider05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		StringBuilder a = new StringBuilder("abcdefghijhij");
		System.out.println(a);
		for (int i = 2; i < a.length(); i += 3) {
			a.deleteCharAt(i);
			System.out.println(a);
		}	
	}
}
