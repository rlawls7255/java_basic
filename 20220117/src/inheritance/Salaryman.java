package inheritance;

public class Salaryman extends Person{
	public int salary;


	// Person을 상속해서 Salaryman을 만들어보세요.
	// 샐러리맨은 연봉(salary)를 가집니다.
	// getSalaryInFo()로 상태를 조회할 수 있습니다.


public void getSalaryInFo() {
	System.out.println("이름은 :" + name + "입니다 ,나이는" + age + "입니다, 연봉은 :" + salary + "입니다.");
}
}