package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner�� ���ؼ� ��ü ������ �Է¹�������.
		// �������� ���峻���� ã����� �ܾ �߰��� �Է¹�������.
		// ���� ���� �ִ� �ܾ���� �ε��� ��ȣ��, �� ���� ����Ǿ�����
		// ������ִ� �ڵ带 �ۼ��� ������.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ü ������ �Է����ּ���.");
		String sentence = scan.nextLine();
		
		System.out.println("���� ������ ī������ �ܾ �Է����ּ���.");
		String searchVoca =  scan.nextLine();
		
		// ���� ī����
		int count = 0;
		// �ݺ��� �߰� ���� ����
		boolean bool = true;
		// ���������� �߰ߵ� ����
		int fidx = -1;
		while(bool) {
			// fidx�� ���������� ��ȸ�� �����̹Ƿ�
			// fidx + 1���� �ܾ ã�� �����ؾ���
			
			// indexOf�� �����ߴµ� -1�� ���´ٸ�
			// �� ã�� �ʿ䰡 ���ٴ� �ǹ���.
			int get = sentence.indexOf(searchVoca, fidx + 1); /* 2. ����� �ε��� ��ȣ�� +1 ���� searchVoca�� ã�� �����Ѵ�. */
			if(get == -1) {
				// get�� -1�� ����ȴٸ� ��ȸ�� �ʿ䰡
				// �����Ƿ� bool�� false�� �ٲ�
				// while���� Ż���ϰ� �մϴ�.
				bool = false;
			}else {
				// ������ �߰����� ����
				fidx = get; /* 1. fidx�� searchVoca�� ��ġ index��ȣ�� �ִ´� */
				count++; //�۾� ī��Ʈ ����
				System.out.println(get + "�� �ε������� " + 
						count + "��° " + searchVoca + "��(��) ����Ǿ����ϴ�.");
			}
		}
		System.out.println(searchVoca + "�� �� ���� Ƚ����" + count + "ȸ�Դϴ�.");
	}
}

