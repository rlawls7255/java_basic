package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warrior w1 = new Warrior("김진");
		// public 요소는 외부지역에서 마음대로 값을 변경할 수 있음.
		// private 요소는 외부지역에서는 절대로 값을 조회하거나 변경할수없음.
		//w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();
		
	}

}
