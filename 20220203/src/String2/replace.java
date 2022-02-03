package String2;

public class replace {

	public static void main(String[] args) {
		// .replace()는 찾아바꾸기 입니다.
		// .replace("찾을 단어", "바꿔줄 단어"); 순으로 입력합니다.
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		report.replace("김영수", "소윤희"); /* 리턴을 하겠다는 이야기는 콘솔에 찍어준다는 것이 x */
		System.out.println(report); /* 기존 String으로 출력 */ 
		System.out.println(report.replace("김영수", "소윤희")); /* replace 메소드 적용된 String 리턴 */
		System.out.println(report); /* replace는 바뀐 값으로 저장은 안됩니다. */ 
		// 바뀐 내역을 저장까지 하고싶다면...
		report = report.replace("김영수", "소윤희");
		System.out.println(report);
	}
}
