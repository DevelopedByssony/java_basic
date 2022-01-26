
public class review {

	public static void main(String[] args) {
		// 피라미드형 별찍기
		// *
		// **
		// ***
		// ****
		
		for (int i = 1; i<5; i++) {
			for (int j = 1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
