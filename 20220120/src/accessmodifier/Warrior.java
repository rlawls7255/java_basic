package accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String name) {
		super(name);
		
	}
	public void hunt() {
		setHp(getHp() -1);
		setExp(getExp() + 10);
	}

	public void doubleAttack() {
		setHp(getHp() - 4);
		setExp(getExp()+ 25);
	}
	public void getInFo() {
		System.out.println("현재 체력은 : " + getHp()+"현재 마나는 : " + getMp()+ " 현재 레벨은 : " + getLv()+ "현재 경험치는 : " + getExp()+ "이름은 : " + getName());
	}
}
