package exception1;

public class Exception02P348 {
	public static void main(String[] args) {
		// 예외 발생 케이스 2 ArithmeticException: / by zero
		// 시행 예외는 실행하기 전까지는 예외를 인지할 수 없는 예외입니다.
		// 대표적인 예시로는 특정한 숫자를 0으로 나누는 것입니다.
		int a = 1; /// :) 자료형 = 정수
		int b = 0; /// :) 자료형 = 정수
		String[] args2 = new String[args.length + 1]; 
		System.out.println("예외 발생 전에 실행될 구문");
		System.out.println(a / b);
		System.out.println("예외 발생 후에 실행될 구문"); // 실행되지 않음
	}
	
}
