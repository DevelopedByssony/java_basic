package stringbuilder2;

public class Builder08P408 {

	public static void main(String[] args) {
		// reverse()�� ���ڿ��� �ε��� ������ ��������
		// �������� �������ݴϴ�.
		StringBuilder str = new StringBuilder("���󳪸���"); /* �ε��� ��ȣ ���������� 01234 */
		str.reverse();
		System.out.println(str); /* �ε��� ��ȣ ���� 43210 */
	}
}