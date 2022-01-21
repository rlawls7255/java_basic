package overloading;

public class Caculator {
	
	public void plus(int a) { // 파라미터로 int a 값만 요구
		System.out.println(a +"에 1을 더한값은 " + (a + 1) + "입니다");
	}

	public void plus(int a , int b) { // 파라미터로 int a , int b를 요구
		System.out.println(a + "에" + b + "를 더한값은" + (a+b) + "입니다");
	}
	
	public void plus(double a) { // 파라미터 값으로 double a 요구 (넣은 값에 0.5를 더해서 출력)
		System.out.println(a +"에 1을 더한값은 " + (a + 0.5) + "입니다");
	}
	
	public void plus(String str) { // 파라미터 값으로 String str 요구 (문자열은 연산 대상이 아닙니다 출력.)
		System.out.println("문자열은 연산 대상이 아닙니다.");
	}
}
