package string1;

import java.util.Scanner;

public class String03P399 {
	public static void main(String[] args) {
		// Scanner�� ���ؼ� ��ü ������ �Է¹�������.
		// �������� ���峻���� ã����� �ܾ �߰��� �Է¹�������.
		// ���� ���� �ִ� �ܾ���� �ε��� ��ȣ��, �� ���� ����Ǿ�����
		// ������ִ� �ڵ带 �ۼ��� ������.
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		String a = scanner.next();
		// int get = tomato.indexOf("to");
		System.out.println("���� ������ ī������ �ܾ �Է����ּ���.");
		String b = scanner.next();
		int get = a.indexOf(b);
		System.out.println(get + "�� �ε�������" + "'" + b + "'" + "�� ����Ǿ����ϴ�.");
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			Char banana = a.charAt(i);
			if(banana == b) {
				count++;
	}
}
