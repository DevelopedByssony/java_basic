package String2;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		// 로그인 로직을 만들어보겠습니다.
		// 먼저 String id에 여러분이 설정한 임의의 아이디를
		String id = "n_uck";
		// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		String pw = "12345";
		// 다음, 사용자에게 Scanner를 이용해
		Scanner scan = new Scanner(System.in);
		// uId 변수에는 아이디를(사용자가 입력한 아이디)
		System.out.println("아이디를 입력해주세요.");
		String uId = scan.nextLine();
		
		/*
		 중첩 if문의 사용
		 보통 중첩 if문까지만 쓰고 3중 if는 코드가 너무 복잡해지기 때문에 잘 사용하지 않습니다.
		 */
		
		if (uId.equals(id)) { /* uId.equals(id)의 결과값이 true or false로 리턴될 경우 */
			System.out.println("비밀번호를 입력해주세요."); /* true라면 */
			String uPw = scan.nextLine();
			if (uPw.equals(pw)) { /* uPw.equals(pw)의 결과값이 true or false로 리턴 */
				System.out.println(id + "님 환영합니다."); /*true라면 */
			} else { System.out.println("비밀번호가 틀렸습니다.");} /* false라면 */
		} else { System.out.println("그런 아이디는 없습니다.");} /* false라면 */
		}
}
