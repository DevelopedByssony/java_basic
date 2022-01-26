package abstract1;

// Parent 상속을 시켜보세요.
public class Child extends Parent { /// 추상클래스의 자식클래스는 abstract를 별도로 안 쓰는군.
	
	// getAge를 오버라이딩해주세요.
	// "부모쪽 나이는 private이라 조회가 안됩니다"라고 출력해주세요.
	public void getAge() { /// 부모 쪽에서 만들어진 추상메서드 오버라이딩할 때 abstract 안 쓰네?
		System.out.println("부모쪽 나이는 private이라 조회가 안됩니다.");
	}
}
