package String2;

public class substring {

	public static void main(String[] args) {
		// substirng()�� �ε��� �������� �� ���ڿ��� �����մϴ�.
		// �ε��� ��ȣ�� �� �� �ָ� ó�� �ε�����ȣ ~ �ι�° �ε�����ȣ ���̸� �����ݴϴ�.
		
		String str = "�ڹ��ڹ�jspjsp������������";
		String result = str.substring(5);
		System.out.println(result);

		result = str.substring(10,15);
		System.out.println(result);

	}
}
