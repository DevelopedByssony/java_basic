package String2;

public class trim {

	public static void main(String[] args) {
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.
		String str = "                   Hello    Java               ";
		System.out.println(str.trim()); /* 공백과 공백 사이의 (앞 뒤 공백) 문자만 추출함 */
		System.out.println(str);
		
		str = str.replace("    ", ""); /* 문자 사이의 공백은 replace()로 제거할 수 있다 */
		System.out.println(str.trim());
		
		// System.out.println(str.replace("         ", "").trim());
	}
}
