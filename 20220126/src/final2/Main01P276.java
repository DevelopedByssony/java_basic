package final2;

public class Main01P276 {

	public static void main(String[] args) {
		// ���(final static)�� ���� ���� ����
		// 1. Country��� �Ҽ��� ����� ��
		// 2. .������� ��� Country�� �Ҽӵ� ����� ȣ����
		
		// �� ���� ������ ȣ���� �ܼ�â�� ����ּ���.
		System.out.println(Country.KOREA);
		System.out.println(Country.CANADA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		
		/// The final field Country.KOREA cannot be assigned
		// Country.KOREA = 10000;
		
		// ����� �̹� �ڹ� �⺻ Ŭ���� �������� Ȱ��ǰ� ������
		// ��ǥ������ Math(����) Ŭ���� ���� PI(������)�� �� �� �ֽ��ϴ�.
		System.out.println(Math.PI); 
	}
}
