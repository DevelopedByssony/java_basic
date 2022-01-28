package system1;

public class TimeCheck02P384 {
	public static void main(String[] args) {
	// try ~ catch 구문의 소요시간을 구해주세요.
	// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요
	// throw로 발생시키면 됩니다.
	long start = System.currentTimeMillis(); //
	System.out.println("시작 시간 :" + start);
		
	long all = 0;
		
	try { 
		if (start > 1643369473) 
		{ throw new ArrayIndexOutOfBoundsException(); }
		else if (for (long i = 0; i < 2000L; i++)) 
		{all += i;}
		System.out.println("1부터 2000까지 총합 : " + all);
		}
	catch (Exception e) {
		System.out.println("없던 예외를 만들었습니다.");
		}
	long end = System.currentTimeMillis();
	System.out.println("끝난 시간 : " + end);
	System.out.println("소요 시간 : " + (end - start));
}
