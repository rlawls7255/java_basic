package interface1;

// 인터페이스 구현(상속이 아님!) 하기 위해ㅐ서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;

	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 100을 자동으로 대입해주세요.
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = Max_Gas;
	}

	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해 주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		if(speed + 10 > 200) {
			speed = Max_Speed;
		}else {
			speed +=10;
		}
		gas -=1;
		
	}

	@Override
	public void breakSpeed() {
		if(speed -10 < 0) {
			speed=Zero_Speed;}
			else {
				speed -=10;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 연료 최대량은 70l로 간주하고 70으로 설정합니다.
		if(gas + 30 > 70) {
			gas = Max_Gas;
		}else {
			gas += 30;
		}
		
	}

	@Override
	public void showStatus() {
		// 자동차의 솓도, 연료량, 차주가 누군지 나오도록 해줍니다.
		System.out.println("자동차의 속도 :" + this.speed + "연료량 :" + this.gas + "차주 :" + this.name);
		
	}
	
}
