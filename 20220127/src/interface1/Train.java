package interface1;

public class Train implements Vehicle {
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = 0;
		this.name = name;
		this.gas = TMax_Gas;
	}

	@Override
	public void accel() {
		if(speed + TIncrease_Speed > TMax_Speed) {
			speed = TMax_Speed;
		}else { 
			speed  += TIncrease_Speed;
		
		}
		gas -= TDecrease_Gas;
		}
		
		
		
	

	@Override
	public void breakSpeed() {
		if(this.speed - TDecrease_Speed < Zero_Speed) {
			this.speed = Zero_Speed ;
		}else {
			speed -= Zero_Speed;
		}
		
	}

	@Override
	public void reFuel() {
		if(gas + TRefuel_Gas > TMax_Gas) {
			gas = TMax_Gas;
		}else {
			gas += TRefuel_Gas;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("기차의 속도 :" + this.speed + "연료량 :" + this.gas + "차주 :" + this.name);
		
	}

}
