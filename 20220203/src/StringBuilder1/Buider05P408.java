package StringBuilder1;

public class Buider05P408 {

	public static void main(String[] args) {
		// ���� ���ڿ��� ���ڸ� 0������ �����ؼ� 3��°���� �������ּ���.
		// ��Ʈ : �ݺ����� ������.
		StringBuilder a = new StringBuilder("abcdefghijhij");
		System.out.println(a);
		for (int i = 2; i < a.length(); i += 3) {
			a.deleteCharAt(i);
			System.out.println(a);
		}	
	}
}
