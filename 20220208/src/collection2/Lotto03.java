package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
		
		// boolean bool = l1.equals(l2);
		// boolean booll = true;
		// 로또 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum = 0; 
		int tmp = 0;
		
		// System.out.println(getNum)

		while(lotto.size() != 6) {
			// 번호 뽑기
			getNum = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목룍에 포함되어 있지 않다면 (* contains를 쓰세요.)
			if (!lotto.contains(getNum)) {
				// 추가하기
				lotto.add(getNum);
			}
		} 
		
		for (int i = 0; i < 6; i++) {
			tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num]
		}
			
		while(l2.size() != 6) {
			// 번호 뽑기
			getNumm = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목룍에 포함되어 있지 않다면 (* contains를 쓰세요.)
			if (!l2.contains(getNumm)) {
				// 추가하기
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
		
