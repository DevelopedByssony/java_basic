package StringBuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다.
		// Delete(시작 인덱스 번호, 끝 인덱스 번호)를 입력하면
		// 시작 지점부터 끝 지점 사이를 삭제해줍니다.
		StringBuilder a = new StringBuilder("012345678910");
		System.out.println(a);
		a.delete(1, 8); /* 뒤에 들어오는 인자는 포함하지 않음 = 뒤의 인자 -1까지 삭제한다는 소리 */
		System.out.println(a);
	}
}
