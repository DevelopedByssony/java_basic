package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// int a, b�� ��ĳ�ʷ� ���� ������ �Է¹޾��ּ���.
		Scanner scan = new Scanner(System.in);
		System.out.println("1�� ������ �Է����ּ���.");
		int a = scan.nextInt(); 
		System.out.println("2�� ������ �Է����ּ���.");
		int b = scan.nextInt(); 
		// a / b�� ����� �ֿܼ� ����ֽõ�
		// a / b�� �����ϱ� ����
		// b�� 0���� �˻��ؼ� 0�� ����
		// a / b�� �������� ���� "0���� ���ڸ� ���� �� �����ϴ�."
		// ��� ��� ��쵵�� ������ �ۼ��غ�����.
		/// :) C������ �̷��� ���������� ����ó���մϴ�.
		if (b == 0) {
			System.out.println("0���� ���ڸ� ���� �� �����ϴ�.");
		} else { 
			System.out.println(a / b); 
		}
	}
}
