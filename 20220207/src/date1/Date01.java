package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date�� ��¥�� ǥ���ϴ� Ŭ������ DB��� ����� ��
		// Date�� �̿��ؼ� ��¥�ڷḦ �޾ƿ��ų� �Ѱ��ִ� ���� ����˴ϴ�.
		// ���� import java.utill.Date�� ���� �Է��ؾ� �� �� �ֽ��ϴ�. (import java.sql.Date x)
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// ǥ���Ǵ� ����� �ٲ� ���� SimpleDateFormat�� Ȱ���մϴ�.
		// import�� �߰��ؾ� �մϴ�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); // �Ұ�ȣ ���̿� ����� �־����
		// ����� yyyy�� ����, MM�� ��, dd�� ��, hh�� ��, mm�� ��, ss�� ��
		System.out.println(sdf);
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		// now ������ ����ִ� ��� ����� 2022�� 02�� 07�� aa�� bb�� cc�ʷ� �����ؼ� �ֿܼ� ����ּ���.
		// 469�������� ���� simpleDateFormat�� ���� ���ø� ����� �ֽ��ϴ�.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��, �ð��� : z");
		// Ÿ������ z�� ǥ���մϴ�.
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
	}
}
