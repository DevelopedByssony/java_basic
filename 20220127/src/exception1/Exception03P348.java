package exception1;

import java.util.Scanner;

public class Exception03P348 {

	public static void main(String[] args) {
		// ���� �߻� ���̽� 3.NullPointerException = �� �ּҰ� ��� ����
		// Ŭ���� �ڷ����� ������ �� new�� �������� ����� �����͸� �������� ���� ���
		Scanner scan = null; // nulll�� ������ ����
		scan.nextInt(); 
	}
}
