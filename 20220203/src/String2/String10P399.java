package String2;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		// �α��� ������ �����ڽ��ϴ�.
		// ���� String id�� �������� ������ ������ ���̵�
		String id = "n_uck";
		// String pw�� �������� ������ ������ ��й�ȣ�� �������ּ���.
		String pw = "12345";
		// ����, ����ڿ��� Scanner�� �̿���
		Scanner scan = new Scanner(System.in);
		// uId �������� ���̵�(����ڰ� �Է��� ���̵�)
		System.out.println("���̵� �Է����ּ���.");
		String uId = scan.nextLine();
		
		/*
		 ��ø if���� ���
		 ���� ��ø if�������� ���� 3�� if�� �ڵ尡 �ʹ� ���������� ������ �� ������� �ʽ��ϴ�.
		 */
		
		if (uId.equals(id)) { /* uId.equals(id)�� ������� true or false�� ���ϵ� ��� */
			System.out.println("��й�ȣ�� �Է����ּ���."); /* true��� */
			String uPw = scan.nextLine();
			if (uPw.equals(pw)) { /* uPw.equals(pw)�� ������� true or false�� ���� */
				System.out.println(id + "�� ȯ���մϴ�."); /*true��� */
			} else { System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");} /* false��� */
		} else { System.out.println("�׷� ���̵�� �����ϴ�.");} /* false��� */
		}
}
