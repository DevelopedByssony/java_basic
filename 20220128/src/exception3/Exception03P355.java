package exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// ���� catch�� �� ���ο��� ���� ������ ���ܰ� �߻��� �� ���� ��
		// ���� ���������� �ٸ��� ó���� �� ����մϴ�.
		// �� �� catch������ ������ ����� �� �ֽ��ϴ�.
		int[] number = {1, 2, 3, 4, 5, 0};
		
		// ���ܰ� �߻������� �𸣴� �ڵ���� try���� �ֽ��ϴ�.
		try {
			for(int i = 0; i < 6; i++) {// ArrayIndexOutOfBoundsException
				System.out.println(number[i]);
			}
			System.out.println("0���� ������ �õ��غ��ڽ��ϴ�.");
			System.out.println(number[4] / number[5]);//ArithmeticException
		} catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("������ ��� �ε��� ��ȣ�� �Է��߽��ϴ�.");
		} catch(ArithmeticException ae) {
			System.out.println("0���� ���ڸ� ���� �� �����ϴ�.");
		} catch(Exception e) {
			//Exception e �� ����ó���������� � ���ܵ� �� �ϰ�ó���մϴ�.
			//����ó�������� �� �ؿ� ������ �մϴ�. �׷��� ���ʿ��� �ٸ� ������ ���ܸ�
			// ó������ �� �ֽ��ϴ�.
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} 
	}
}
