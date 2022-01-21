package game.interaction;

public class Orc {
	// 오크는 hp, atk 을 가집니다.
	private int hp;
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	private int atk;
	
	
	// 생성자는 오크에게 hp 5, atk 3을 부여합니다
	public Orc() {
		this.hp = 5;
		this.atk = 3;
	}
	public void doBattle(int uATK) {
		this.hp -= uATK;
		System.out.println("오크의 남은 체력 : " + this.hp);
	}

}
