package StringBuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete�� �� �״�� ���ڿ��� �Ϻ�, Ȥ�� ��ü�� �����մϴ�.
		// Delete(���� �ε��� ��ȣ, �� �ε��� ��ȣ)�� �Է��ϸ�
		// ���� �������� �� ���� ���̸� �������ݴϴ�.
		StringBuilder a = new StringBuilder("012345678910");
		System.out.println(a);
		a.delete(1, 8); /* �ڿ� ������ ���ڴ� �������� ���� = ���� ���� -1���� �����Ѵٴ� �Ҹ� */
		System.out.println(a);
	}
}
