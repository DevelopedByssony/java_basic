package accessmodifier;

public class main {

	public static void main(String[] args) {
		// Magician을 하나 생성해주세요.
		Magician c1 = new Magician("마법사");
		
		// getInfo()로 정보를 조회해주세요.
		c1.getInfo();
		
		// hunt()를 2번 호출해 사냥을 2번 해주세요.
        // c1.hunt();
		// c1.hunt();

		c1.fireball();
		
		// 사냥이 끝나고 다시 getInfo()를 해주세요.
		c1.getInfo();
	}

}
