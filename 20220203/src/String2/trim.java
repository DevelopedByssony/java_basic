package String2;

public class trim {

	public static void main(String[] args) {
		// trim()�� ������ �ƴ� ���ڰ� �����ϱ� ���� ��� ������
		// ����ƴ� ���ڷ� ���� ���� ������ ��� ������ �����մϴ�.
		String str = "                   Hello    Java               ";
		System.out.println(str.trim()); /* ����� ���� ������ (�� �� ����) ���ڸ� ������ */
		System.out.println(str);
		
		str = str.replace("    ", ""); /* ���� ������ ������ replace()�� ������ �� �ִ� */
		System.out.println(str.trim());
		
		// System.out.println(str.replace("         ", "").trim());
	}
}
