import java.util.Scanner;

public class aaaaaaaaaa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // r 오른쪽에 커서 두고 컨트롤 + 스페이스해서 java.util 선택
		// int a = scan.nextInt(); // 정수 하나를 a변수에 입력받기.
		// System.out.println(a); // 입력받은 정수 콘솔에 찍기.
		
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.nextLine();

		System.out.println("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		
	}

}
