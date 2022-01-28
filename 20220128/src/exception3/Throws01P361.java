package exception3;

public class Throws01P361 {

	public static void doIt(String[] s, int i) 
		throws ArrayIndexOutOfBoundsException {
		// ���ΰ� �ε��� ��ȸ�̹Ƿ�, ������ ArrayIndexOutOfBoundsException �߻��� ������
		System.out.println(s[i]);
	}
	
	public static void main(String[] args) {
		// Ư�� �޼��� �������� �߻��ϴ� �ڵ�� ������ ���ϸ� try�� �ܺ���
		// ���ܹ߻����� ���ֵ˴ϴ�.
		// ���� ���������δ� try�� �ۿ� ������ �����δ� try���� ���Ѱ�ó�� ó���ϱ� ����
		// throws�� ����� ���� �޼��� �ڿ� �ٿ��ݴϴ�.
		String[] greetings = {"�ȳ�", "hi", "���Ͽ�", "�οӵ�"};
		int i = (int)(Math.random() * 5);  // Math.random() * 5 = 4, ��� �ȿ� �ִ� ���� 0,1,2,3,4 �� �ϳ� = 20% Ȯ���� ���ܰ� �߻�
		
		try {
			doIt(greetings, i);
		} catch(Exception e) {
			System.out.println("main�������� ó���߽��ϴ�.");
		} 

}
}
