package static1;

public class Main02P276 {
	public static void main(String[] args) {
		
	
	// static 변수는 생성 없이도 활용할 수 있다.
	// 클래스명.변수명 으로 정적변수를 마음대로 호출 가능합니다.
	System.out.println(StaticTest.num2);
	//System.out.println(StaticTest.num1);
	// check도 직접 해보세요
	StaticTest.check();
	
	StaticTest s1 = new StaticTest();
	s1.check();

}
}