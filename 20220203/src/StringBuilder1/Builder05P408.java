package stringbuilder1;

public class Builder05P408_2 {

	public static void main(String[] args) {
		// ���� ���ڿ��� ���ڸ� 0������ �����ؼ� 3��°���� �������ּ���.
		// ��Ʈ : �ݺ����� ������
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		System.out.println(a);
		int checkNum = a.length() % 3;
		
		int loopNum = a.length() - checkNum;
		
		for(int i = loopNum; i > -1; i--) {
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);

	}

}