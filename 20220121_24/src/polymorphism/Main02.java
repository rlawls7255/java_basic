package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person s1 = new Student("김진",21,100);
		Person p1 = new Person("나 ", 20);
		Person o1 = new Police("sl", 32,10);
		Person t1 = new Teacher("d",28,2000);
		
		
		s1.showPerson();
		p1.showPerson();
		o1.showPerson();
		t1.showPerson();
		
		

	}

}
