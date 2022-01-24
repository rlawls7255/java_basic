package polymorphism;

public class Teacher extends Person {

	private int money;
	public Teacher(String name, int age,int money) {
		super(name, age);
		this.money = money;
	}
	
	public void showPeson() {
		super.showPerson();
		System.out.println("연봉은 :" + money);
		
	}

	public void showTeacher() {
		System.out.println("저는 선생입니다.");
	}
}
