package overloading;

public class Main01 {

	public static void main(String[] args) {
		// 1. Calculator를 생성해주세요.
		Caculator c1 = new Caculator();
		// 2. plus(int)를 호출해보겠습니다.
		c1.plus(4);
		// 3. plus(int a , int b)를 호출해보겠습니다.
		c1.plus(2, 5);
		c1.plus(1.0);
		c1.plus(null);

	}

}
