package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// Cat ,Dog, Aniaml을 하나씩 만들어주세요.
		// Animal c1, d1,a1으로 받아주세요
		
		Animal a1 = new Animal(" 나" , 2);
		Cat c1 = new Cat("미호",4);
		Dog d1 = new Dog();
		
		// c1, d1 , a1에 대해서 .sit()을 각각 호출해보세요
		
		c1.sit();
		a1.sit();
		d1.sit();
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animat타입이나, 힙에 저당된 데이터가 cat
		// 이므로 Cat으로 변환이 가능합.
		cat.gukguk();
		
		// a1은 힙/스택 모두에 Animal로만 저장되어 있어
		// 다른 자료형으로 변환이 불가능합니다.
	}

}
