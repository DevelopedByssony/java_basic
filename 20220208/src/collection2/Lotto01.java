package collection2;

import java.util.Collections;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List;
import java.util.Random; 

public class Lotto01 {

	public static void main(String[] args) {
		// �ζǺ��� ��÷�⸦ �����ڽ��ϴ�.
		// �ζǺ��� ��÷��� 1~45 �������� ��ġ�� ���� ����
		// 6���� ���ڸ� �̽��ϴ�.
		// ������ �����ؼ� �ֿܼ� ����ֵ��� ������ּ���.
		// ArrayList�� ������ .sort()���
		// Collections.sort(ArrayList)�� ����մϴ�.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> second = new ArrayList<>();
		
		int getNum = 0; // �ζ� ��ȣ�� ���� �� �ִ� ���� ���� �� 0���� �ʱ�ȭ
		int secondNum = 0;
		
		while(lotto.size() != 6) {
			// ��ȣ �̱�
			getNum = (int)(Math.random() * 45) + 1;
			// ��ȣ�� ���� ������ ���� ��ȣ �񏋿� ���ԵǾ� ���� �ʴٸ� (* contains�� ������.)
			if (!lotto.contains(getNum)) {
				// �߰��ϱ�
				lotto.add(getNum);
			}
		}
		
		// �� ���� �����ϱ� 
		Collections.sort(lotto);
				
		// ��÷ ��ȣ �����ֱ�
		System.out.println("��÷ ��ȣ" + lotto);	
		
		// 2�� ��÷ ��ȣ �����ֱ�
		while(lotto.contains(getNum)) {
			getNum = (int)(Math.random() * 45) + 1;
		}
		// �ݺ��� Ż�� �� 2�� ��÷��ȣ ȭ�鿡 ���
		System.out.println("2�� ��÷ ��ȣ" + getNum);
}
}
