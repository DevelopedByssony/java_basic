package exception1;

public class Exception02P348 {
	public static void main(String[] args) {
		// ���� �߻� ���̽� 2 ArithmeticException: / by zero
		// ���� ���ܴ� �����ϱ� �������� ���ܸ� ������ �� ���� �����Դϴ�.
		// ��ǥ���� ���÷δ� Ư���� ���ڸ� 0���� ������ ���Դϴ�.
		int a = 1; /// :) �ڷ��� = ����
		int b = 0; /// :) �ڷ��� = ����
		String[] args2 = new String[args.length + 1]; 
		System.out.println("���� �߻� ���� ����� ����");
		System.out.println(a / b);
		System.out.println("���� �߻� �Ŀ� ����� ����"); // ������� ����
	}
	
}
