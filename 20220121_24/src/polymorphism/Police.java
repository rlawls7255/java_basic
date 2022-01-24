package polymorphism;

public class Police extends Person {

	private int career;
	public Police(String name, int age, int career) {
		super(name, age);
		this.career = career;
		
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("경력은 :" + career);
	}
	public void showPolice() {
		System.out.println("저는 경찰입니다.");
	}

}

