package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// �ζǺ��� ��÷ �ùķ����͸� ������ּ���.
		// �� ���� ��� ��÷�Ǵ��� �ùķ��̼� �غ��ڽ��ϴ�.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
		
		// boolean bool = l1.equals(l2);
		// boolean booll = true;
		// �ζ� ��ȣ�� ���� �� �ִ� ���� ���� �� 0���� �ʱ�ȭ
		int getNum = 0; 
		int tmp = 0;
		
		// System.out.println(getNum)

		while(lotto.size() != 6) {
			// ��ȣ �̱�
			getNum = (int)(Math.random() * 45) + 1;
			// ��ȣ�� ���� ������ ���� ��ȣ �񏋿� ���ԵǾ� ���� �ʴٸ� (* contains�� ������.)
			if (!lotto.contains(getNum)) {
				// �߰��ϱ�
				lotto.add(getNum);
			}
		} 
		
		for (int i = 0; i < 6; i++) {
			tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num]
		}
			
		while(l2.size() != 6) {
			// ��ȣ �̱�
			getNumm = (int)(Math.random() * 45) + 1;
			// ��ȣ�� ���� ������ ���� ��ȣ �񏋿� ���ԵǾ� ���� �ʴٸ� (* contains�� ������.)
			if (!l2.contains(getNumm)) {
				// �߰��ϱ�
				l2.add(getNumm);
			}
		}
		
		while(!l1.equals(l2)) {
			l2.clear();
		}
		
		if (l1.equals(l2) == true) {continue;}
		System.out.print(l1); 
		System.out.println(l2);
		
		if (l1.equals(l2)) {break;}
		
		}
		}
		
		// System.out.println(bool);
		
