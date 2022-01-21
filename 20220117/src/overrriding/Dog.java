package overrriding;

public class Dog extends Animal {

	public String kind;

public void howl() {
	System.out.println("왈왈");
}
public void getInFo() {
	System.out.println("이름은 :" + name + "나이는 : " + age + "성별은 : " + gender+ "품종은 : " + kind);
}
}