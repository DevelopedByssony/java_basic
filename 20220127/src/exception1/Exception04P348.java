package exception1;

public class Exception04P348 {
	public static void main(String[] args) {
		// ���� �߻� ���̽� 4. ArrayIndexOutOfBoundsException
		// Ư�� �迭�� ��������� �迭 �ε����� �ʰ��ؼ� �Է��ϴ� ���
		int[] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]); // -> �������� �ʴ�(0~4������ ����)��ȣ�� ��ȸ 	
	}
}
