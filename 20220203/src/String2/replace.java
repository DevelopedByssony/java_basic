package String2;

public class replace {

	public static void main(String[] args) {
		// .replace()�� ã�ƹٲٱ� �Դϴ�.
		// .replace("ã�� �ܾ�", "�ٲ��� �ܾ�"); ������ �Է��մϴ�.
		String report = "�ȳ��ϼ���. ����Ʈ �����ڴ� �迵��, �迵�� �Դϴ�.";
		report.replace("�迵��", "������"); /* ������ �ϰڴٴ� �̾߱�� �ֿܼ� ����شٴ� ���� x */
		System.out.println(report); /* ���� String���� ��� */ 
		System.out.println(report.replace("�迵��", "������")); /* replace �޼ҵ� ����� String ���� */
		System.out.println(report); /* replace�� �ٲ� ������ ������ �ȵ˴ϴ�. */ 
		// �ٲ� ������ ������� �ϰ�ʹٸ�...
		report = report.replace("�迵��", "������");
		System.out.println(report);
	}
}
