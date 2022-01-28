package exception3;

public class Exception03P355 {
	// ���� catch�� ��� ���ο��� ���� ������ ���ܰ� �߻��� �� ���� ��
	// ���� ���������� �ٸ��� ó���� �� ����մϴ�.
	// �� �� catch ������ ������ ����� �� �ֽ��ϴ�.
	int[] number = {1,2,3,4,5,0};
	
	// ���ܰ� �߻������� �𸣴� �ڵ���� try���� �ֽ��ϴ�.
	try {
		for (int i = 0; i <6; i++) {
			System.out.println(number[i]); // ArrayIndexOutOfBoundsException
		}
		System.out.println("0���� ������ �õ��غ��ڽ��ϴ�.");
		System.out.println(number[4] / number[5]); // ArithmeticException
	} catch(ArrayIndexOutOfBoundsException ai) {
		System.out.println("������ ��� �ε��� ��ȣ�� �Է��߽��ϴ�.");
	} catch(Exception e) {
		// Exception e�� ����ó���������� � ���ܵ� �� �ϰ�ó���մϴ�.
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}
}
