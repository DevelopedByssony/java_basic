package system1;

public class TimeCheck01P384 {

	public static void main(String[] args) {
		// currnetTumeMills의 자료는 long형에 저장해야 합니다.
		// 시작지점
		long start = System.currentTimeMillis(); 
		System.out.println("시작 시간 :" + start);
		
		long all = 0;
		
		for (long i = 0; i < 2000L; i++) {
			all += i;
		}
		System.out.println("1부터 2000까지 총합 : " + all);
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난 시간 : " + end);
		System.out.println("소요 시간 : " + (end - start));

	}
}
