package date1;

import java.util.Calendar;

public class Calendar01P470 {

	public static void main(String[] args) {
		// Calender�� ���� �ð��� �Ϲ����� ����� �ƴ� ����, ����/���� ������
		// �޷� �������� ǥ�����ִ� ����Դϴ�.
		// Calendar.getInstance();�� �̿��� ����մϴ�.
		// �߻� Ŭ�������� new Ű����� ���� ������ �� �� �����ϴ�.
		// Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		
		// now.get(Calendar.���ϴ�����); �������� ��ȸ�մϴ�.
		System.out.println("�⵵ : " + now.get(Calendar.YEAR));
		// ���� ��ȸ�غ�����. ���� 0���� ���ϴ�.(0�� 1��, 11�� 12��)
		System.out.println("�� : " + (now.get(Calendar.MONTH)+1));
		// ���� DAY_OF_MONTH�Դϴ�.
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH)); // DATE�ε� ��ü������
		// ���ϵ� ���� �� �ִµ�, ������ 1�� �Ͽ���, 7�� ������Դϴ�. (0�� ����)
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK));
		// ���� 0, ���� 1
		System.out.println("����, ���Ŀ��� : " + now.get(Calendar.AM_PM));	
		System.out.println("�� : " + now.get(Calendar.HOUR));
		System.out.println("�� : " + now.get(Calendar.MINUTE));
		System.out.println("�� : " + now.get(Calendar.SECOND));
	}
}
