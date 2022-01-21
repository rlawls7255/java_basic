package overrriding;

public class Animal {
	public String gender;
	public String name;
	public int age;
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
public void getInFo() {
	System.out.println("이름 :" + name + " 나이 :" + age + "성별 : " + gender);
}
}
