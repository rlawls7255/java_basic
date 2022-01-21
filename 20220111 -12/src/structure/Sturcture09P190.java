package structure;

public class Sturcture09P190 {
	
	// getInfo는 고양이에 대한 정보를 얻어와 화면에 출력합니다.
	
	public static void getInfo(Cat c) {
		System.out.println(c.name + " 의 정보입니다.");
		System.out.println("이름 : "+ c.name + ",나이" + c.age + ",품종" + c.kind);
		
	}

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "초코";
		c1.age = 8;
		c1.kind = "페르시안";
         
		Cat c2 = new Cat();
		c2.name = "나미";
		c2.age = 5;
		c2.kind = "벵골";
		
		getInfo(c1);
		getInfo(c2);
	}

}
