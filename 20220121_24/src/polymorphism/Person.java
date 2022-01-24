package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 자리에 대입될 수 있습니다.
	
	protected String name;
	protected int age;

	// 생성자가 이름과 나이를 받아 초기화하게 해주세요.

public Person(String name, int age) {
	this.name =name;
	this.age = age;
return;	
}// person의 전체 데이터를 콘솔에 찍어주는 showPerson()
// Person 타입으로 호출했을때 유일하게 호출 가능한 메서드
//이 메서드를 자식쪽에 오버라이딩 하면
//부모타입으로도 자식쪽 showPerson()을 호출할수있다.

//setter/getter를 만들어주세요.

public void showPerson() {
	System.out.println("이름은 :" + this.name + "나이는 :" + this.age);
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}