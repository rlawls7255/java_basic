package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시갑을 15000원으로 해주시고
		// 다른 하나는 입력없이 생성해주세요
		
		Parttimer p1 = new Parttimer(true,15000, "이자카야" , "김진");
		System.out.println("--------------------------------------------------------------");
		Parttimer p2 = new Parttimer(false,"착한횟집","김빈");
		System.out.println("--------------------------------------------------------------");
		// 시급 5000원을 넣고 파트타이머를 만들어보세요
		Parttimer p3 = new Parttimer(true, 5000, "cgv" , "김진2");

	}

}
