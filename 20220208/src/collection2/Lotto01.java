package collection2;

import java.util.Collections;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List;
import java.util.Random; 

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// Collections.sort(ArrayList)를 사용합니다.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> second = new ArrayList<>();
		
		int getNum = 0; // 로또 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int secondNum = 0;
		
		while(lotto.size() != 6) {
			// 번호 뽑기
			getNum = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목룍에 포함되어 있지 않다면 (* contains를 쓰세요.)
			if (!lotto.contains(getNum)) {
				// 추가하기
				lotto.add(getNum);
			}
		}
		
		// 다 돌면 정렬하기 
		Collections.sort(lotto);
				
		// 추첨 번호 보여주기
		System.out.println("추첨 번호" + lotto);	
		
		// 2등 당첨 번호 보여주기
		while(lotto.contains(getNum)) {
			getNum = (int)(Math.random() * 45) + 1;
		}
		// 반복문 탈출 후 2등 당첨번호 화면에 출력
		System.out.println("2등 당첨 번호" + getNum);
}
}
