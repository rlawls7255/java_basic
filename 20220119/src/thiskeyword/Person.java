package thiskeyword;

public class Person {
	// private으로 사람 정보를 만들어주세요
	// 이름, 나이 , 돈, 전공
	
	private String name;
	private int age;
	private int money;
	private String major;
	
	// 생성자를 만들어주세요. 4개의 항목을 모두 입력받아 해줍니다
	
	public Person(String name, int age, int money , String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	// 이름 나이 소지금액 전공을 콘솔에 찍어주느 getInFo()를 작성해보세요
	public void getInFo() {
		System.out.println("이름 : " + name + " 나이 :" +age + "소지금액" + money + "전공 : " + major);
	}
	

}
