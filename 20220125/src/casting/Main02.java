package casting;

public class Main02 {
	
	public static void main(String[] args) {
		// Ainmal로 cat을 받아서 생성
		Animal a = new Cat("룰루 ",3);
		// a변수와 연결된 heep쪽 자려고 Cat인지 확인
		System.out.println(a instanceof Cat);// a 는 Cat룰 저장 받았음
		
		Animal b = new Dog();
		
		System.out.println(b instanceof Dog);
	}

}
