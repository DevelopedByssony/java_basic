package String2;

import java.util.Scanner;

public class String05P399 {

	public static void main(String[] args) {
		// .length()�� charAt()�� Ȱ���� �Էµ� ��ü ���ڿ���
		// �� ���ھ� �� �پ� ó���ϴ� ������ �ۼ����ּ���.
		// ���ڿ��� Scanner�� �Է¹޽��ϴ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		String a = scan.next();
		for (int i = 0; i < a.length(); i ++) {
		System.out.println(a.charAt(i));}
		scan.close();
	}
}

