package String2;

public class toUpperCase_toLowerCase {

	public static void main(String[] args) {
		// toUperCase()�� ���ڿ� ��ü�� �빮�ڷ� �ٲߴϴ�.
		// �빮�ڿ��� ���� �빮�� ����, �ҹ��ڿ��� ���� �빮�ڷ� �ٲߴϴ�.
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello);

		// toLowerCase()�� ���ڿ� ��ü�� �ҹ��ڷ� �ٲߴϴ�.
		// �ҹ��ڿ��� ���� �ҹ��� ����, �빮�ڿ��� ���� �ҹ��ڷ� �ٲߴϴ�.
		System.out.println(hello.toLowerCase());
		System.out.println(hello);
	}
}
