package inheritance;

public class Person {
	// 사람이라면 공톡적으로 가질 수 있는 속성들을 정의합니다.
	public String name;
	public int age;
	
	// getInFo() 메서드 생성해보기.
	// 이름은 name입니다. 나이는 age입니다 라고 찍게 만들어보세요
	public void getInFo() {
		System.out.println("이름은 :" + name + "입니다 ,나이는" + age + "입니다.");
	}

}
