package exception2;

import java.util.Scanner;

public class TryCatch02P353_InputMismatchException {

	public static void main(String[] args) {
		// ���� exception ��Ű�� ������ ���� �������� ���� �־��µ�
		// �� �� �ϳ��� ��� ���ܰ� �߻��� �� �ִ� �ڵ�� �ۼ����ּ���.
		// �߻��� ���ܿ� ���� ó���� try~catch ����� Ȱ���մϴ�.
		// / by 0(0���� ������)�� ���� ó���� ������� �ʽ��ϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� 1");
		String a = scan.nextInt(); /// nextLine()���� ������ ���� �־ ���ڷ� ó���� (��Ʈ������ ����)
		System.out.println("���ڸ� �Է����ּ��� 2");
		String b = scan.nextInt();
		
		if (a == scan.nextLine() || b == scan.nextInt()) {
			System.out.println("^^�ȵ�~");
		}
	}
}