package collection1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1P447 {

	public static void main(String[] args) {
		// List는 인터페이스이고 구현클래스로 ArrayList와 LinkedList를 받을 수 있고
		// 기본적으로는 ArrayList를 쓰게 됩니다.
		// java.util의 List, ArrayList를 import해 쓰면 됩니다.
		
		// List는 생성시 List<자료형>을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다.
		// <> 사이에는 기본형자료(int, double, boolean등)은 올 수 없습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		String[] list3 = {"사과", "딸기", "망고", "블루베리", "파인애플"};
		System.out.println(list3);
		System.out.println(Arrays.toString(list3));
		
		// 가변자료형이므로 추가하고 싶은 만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1,100); // 1번 인덱스부터 뒤로 한칸씩 밀어서 빈공간을 만들고 100 넣기 
		System.out.println(list1);
		list1.set(1, 99); // 1번 인덱스에 있는 자료를 99로 교체하겠다. (2번 인덱스부터 99 뒤로 밀림)
		System.out.println(list1);
		
		// .contains("자료")는 리스트 내에 찾는 자료가 있으면 true
		// 없다면 false를 출력해준다.
		System.out.println(list1.contains("사과"));
		System.out.println(list1.contains("복숭아"));
		
		// .get(번호)는 주어진 인덱스에 저장되어 있는 자료를 조회해줍니다.
		System.out.println(list1.get(1));
		// 없는 인덱스 번호를 입력해보세요.
		// 없는 번호 입력 시 예외가 발생해 전체 코드가 종료됩니다.
		// System.out.println(list1.get(100));
		
		// .size()로 내부 요소 개수를 확인할 수 있습니다.
		System.out.println(list1.size());
		
		// .isEmpty()는 비어있는지 여부를 체크해줍니다. (비어있나요?)
		System.out.println(list1.isEmpty()); // false(아뇨), true(네)
		
		// 빈 리스트 list2를 여러분이 직접 선언해서 .isEmpty()와 .size()를 조회해주세요.
		System.out.println(list2.isEmpty()); // 비어있는 리스트 --> true로 리턴
		System.out.println(list2.size()); // 비어있는 리스트 --> 내부 요소 개수 0	
	}
}
