package exception2;

import java.util.Scanner;

public class TryCatch02P353_InputMismatchException {

	public static void main(String[] args) {
		// 어제 exception 패키지 내부의 예외 유형들이 여럿 있었는데
		// 그 중 하나를 골라서 예외가 발생할 수 있는 코드로 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		// / by 0(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 1");
		String a = scan.nextInt(); /// nextLine()으로 받으면 숫자 넣어도 문자로 처리함 (스트링으로 리턴)
		System.out.println("숫자를 입력해주세요 2");
		String b = scan.nextInt();
		
		if (a == scan.nextLine() || b == scan.nextInt()) {
			System.out.println("^^안돼~");
		}
	}
}