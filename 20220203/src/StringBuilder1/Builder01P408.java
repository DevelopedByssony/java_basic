package StringBuilder1;

public class Builder01P408 {

	public static void main(String[] args) {
		// StringBuilder�� StringŬ�������� �������̷� ����
		// �ӵ� ������ �Ǿ����ϴ�. �Ϻ� ����� String�� ��Ĩ�ϴ�.
		StringBuilder a = new StringBuilder("adfee");
		System.out.println(a);
		// 2�� ���� ��� �ڷḦ �� ĭ �� �ڷ� �а� Ȯ���� ������ "�μ�Ʈ" �Է�
		a.insert(2, "�μ�Ʈ"); /* ��ġ�� ����, �ڷ� ���� ��� �� ���� ����! */
		System.out.println(a);
	}
}
