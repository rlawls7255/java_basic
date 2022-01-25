package static1;

public class StaticTest {
	// static이 안붙은 변수는 객체가 개별적으로 가지는 변수입니다.
	public int num1;
	
	// static(정적)변수는 모든 객체가 공유하는 하나의 변수입니다.
	// static변수는 객체를 (new 키워드로 자료를) 생성하지 전부터 존재합니다.
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 += 5;
		num2 += 1;
		System.out.println("num1 변수는 변하지 않습니다. :" + num1);
		System.out.println("현재 가입자수 :" + num2 + " 명");
	}

}
