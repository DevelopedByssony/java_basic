package final1;

public class FinalMain02P278 {
	public static void main(String[] args) {
	
		final int WARRIOR_HP = 45;
		final int MONSTER_EXP = 20;
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);

		// final이 붙은 변수를 굳이 쓰는 2번째 이유는 값을 일괄적으로
		// 바꿔주기 편하기 때문입니다.
		System.out.println(50);
		System.out.println(25);
		System.out.println(50);
		System.out.println(25);
		System.out.println(50);
		System.out.println(25);
		System.out.println(50);
		System.out.println(20); //실수로 하나 누락함

	}
	
}
