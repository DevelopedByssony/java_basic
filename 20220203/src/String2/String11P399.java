package String2;

public class String11P399 {

	public static void main(String[] args) {
		// String.valueOf()�� ��ȣ ������ �ڷ���� ���ڿ��� �ٲ��ݴϴ�.
		String a = String.valueOf(1000);
		// int a = 1000;
		System.out.println(a);
		System.out.println(a + 1);
		
		// �Ǽ� �ϳ��� ���Ƿ� ���ڿ��� �ٲ㼭 �����غ�����.
		String b = String.valueOf(2.4);
		System.out.println(b);
		System.out.println(b + 1);
		
		// String.valueOf()�� ���� �ʰ�
		// + "" �����ε� ���ڿ��� ���� �� �ֽ��ϴ�.
		// �ڹٴ� ���ڿ� + �ٸ� �ڷ����� ���� ���� ���� ���ڷ� ġȯ�� ó���մϴ�.
		String c = 1000 + ""; // = "1000";
		System.out.println(c);
		System.out.println(c+1);
		
		// boolean �ڷ����� ���ؼ� �����е��� ���ϴ� ������� ���ڿ�ȭ �ؼ� �ֿܼ� ������.
		boolean d = Boolean.valueOf(false); /* boolean�� ����... */
		String e = String.valueOf(true); 
		System.out.println(d);
		System.out.println(d+"1");
	}
}
