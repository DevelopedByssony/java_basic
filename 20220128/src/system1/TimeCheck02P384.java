package system1;

public class TimeCheck02P384 {
	public static void main(String[] args) {
	// try ~ catch ������ �ҿ�ð��� �����ּ���.
	// ���ο��� �����е��� ���ϴ� �Ӽ��� ���ܸ� �߻���Ű����
	// throw�� �߻���Ű�� �˴ϴ�.
	long start = System.currentTimeMillis(); //
	System.out.println("���� �ð� :" + start);
		
	long all = 0;
		
	try { 
		if (start > 1643369473) 
		{ throw new ArrayIndexOutOfBoundsException(); }
		else if (for (long i = 0; i < 2000L; i++)) 
		{all += i;}
		System.out.println("1���� 2000���� ���� : " + all);
		}
	catch (Exception e) {
		System.out.println("���� ���ܸ� ��������ϴ�.");
		}
	long end = System.currentTimeMillis();
	System.out.println("���� �ð� : " + end);
	System.out.println("�ҿ� �ð� : " + (end - start));
}
