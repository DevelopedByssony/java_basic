package collection2;

public class Example {
	private int a; // 멤버변수 선언
	private int b;

	public Example() { // 생성자 선언
		this.a = 1;
		this.b = 2;
	}


	// 특정 객체를 System.out.println()으로 조회시
	// 오버라이딩된 toString()이 존재하면 주소값 대신
	// toString에서 리턴하는 문자열이 콘솔에 찍혀나옴.

	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}
	}

	/*
	String[] list3 = {"사과", "딸기", "망고", "블루베리", "파인애플"};
	System.out.println(list3);
	System.out.println(Arrays.toString(list3));
	*/
