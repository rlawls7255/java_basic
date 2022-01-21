package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car c1 =new Car();
		c1.model = "bmw";
		c1.price = "2000만원";
		c1.owner = "진";
		
		Car c2 = new Car();
		c2.model = "람보르기니";
		c2.price = "2억원";
		c2.owner = "뻘컵";

		c1.getInFo();
		c2.getInFo();
	}

}
