package game.interaction;

public class Goblin {

	private int hp;
	private int atk;

public Goblin() {
	this.hp = 2;
	this.atk = 1;
}
public void dobattle(int uATK) {
	this.hp -= uATK;
	System.out.println("고블린의 남은 체력 : " + this.hp);
}
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
}