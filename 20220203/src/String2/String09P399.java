package String2;

public class String09P399 {

	public static void main(String[] args) {
		// �⺻������ ���ڿ��� ������ �����̱� ������
		// �񱳸� �� �� �ּҰ� �񱳰� �Ͼ�ϴ�.
		String a = new String("�׽�Ʈ");
		String b = new String("�׽�Ʈ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); /* false */
		String c = "�׽�Ʈ";
		String d = "�׽�Ʈ";
		System.out.println(c == d); /* true */
		
		// .equals()�� �̿��ϸ� �ּҰ� �񱳰� �ƴ�
		// �ش� �ּҰ� ���ڿ� ���빰�� ���� Ȯ�����ݴϴ�.
		// b�� a�� ���빰 �񱳸� ���ּ���.
		System.out.println(b.equals(a)); /* true */
		System.out.println(c.equals(d)); /* true */
	}
}
