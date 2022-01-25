package game.polymorphism;

public class Monster {
	// hp, atk을 변수 (필드, 속성)로 가집니다.
	private int hp;
	private int atk;
	private String name;
	private int exp; // 몬스터 경험치

	
	// 생성자까지 만들어주세요
	
	public Monster(int hp , int atk , String name,int exp) {
		this.hp= hp;
		this.atk= atk;
		this.name = name;
		this.exp = exp;
	}
	
	// doBattle(int)를 생성해주세요.
	// 사용자의 공격력 uAtk만큼 몬스터의 체력이 깍입니다.
	// 체력이 0보다 높으면 남은 체력을 마지막에 콘솔창에 띄워줍니다.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void doBattle(int uAtk) {
		this.hp -=uAtk;
	    System.out.println( this.name +"의 남은 체력 :" + this.hp);
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
	
	// getter/setter를 생성해주세요
}
