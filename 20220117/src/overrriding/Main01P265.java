package overrriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 새성해주시고
		// 오버라이드 된 메서드들을 하나씩 호출해보세요
		Horse h1 = new Horse();
		h1.name = "적토마";
		h1.age = 8;
		h1.rank = 1;
		h1.gender = "수컷";
		
		h1.howl();
		h1.getInFo();
       
		Dog d1 = new Dog();
		d1.name = "미호";
		d1.age = 3;
		d1.gender = "암컷";
		d1.kind = "포메라니안";
		d1.howl();
		d1.getInFo();
		
	}
	

}
