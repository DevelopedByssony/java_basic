package system1;

import java.awt.SystemColor;

public class TimeCheck02P384 {
	public static void main(String[] args) {
	// try ~ catch ������ �ҿ�ð��� �����ּ���.
	// ���ο��� �����е��� ���ϴ� �Ӽ��� ���ܸ� �߻���Ű����
	// throw�� �߻���Ű�� �˴ϴ�.
	
	// ���� �ð� ����
	long start = System.currentTimeMillis();
	System.out.println("���۽ð� :" + start);
	
	try {
		throw new ArithmeticException();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	// ������ �ð� ����
	long end = System.currentTimeMillis();
	System.out.println("������ �ð� : " + end);
	System.out.println("�ҿ� �ð� : " + (end - start));
}
}
