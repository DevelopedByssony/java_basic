package inheritance;

public class Person {
	// 사람이라면 공통적으로 가질 수 있는 속성들을 정의합니다.
	public String name;
	public int age;
	
	public void getInfo() {
		System.out.println("이름은" + name + "입니다." + "나이는" + age + "입니다.");
	}

}
