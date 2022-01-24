package game.interaction;

public class Rogue {
	
	private int hp;
	private int mp;
	private int atk;
	private int lv;
	private int exp;



public Rogue() {
	this.hp=15;
	this.mp = 10;
	this.atk = 8;
	this.lv = 1;
	this.exp = 0;
}
public void huntOrc(Orc orc) {
	// orc의 체력을 검사해서 0이하라면 공격 없이
	// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고 
	// 메서드를 종료되게 해주세요.
	if(orc.getHp() <= 0) {
		System.out.println("오크가 이미 죽은상태입니다.");
		return;
	}
	// orc의 doBattle을 호출해 먼저 오크의 체력을 깍고
	orc.doBattle(this.atk);
	
	// 오크가 전사의 공격으로 죽은 경우 경험치를 10 더해주시고
	// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료 되게해주세요.
	if(orc.getHp() <= 0) {
		this.exp +=10;
		System.out.println("오크가 죽었습니다.");
		System.out.println("도적의 경험치 : " + this.exp);
	}else {
	// 오크 공격력 만큼 자신의 체력을 차감해줍니다.
	this.hp -= orc.getAtk();
    System.out.println("도적의 남은 체력 : " + this.hp);}
}
	public void huntTroll(Troll troll) {
		if(troll.getHp() <= 0) {
			System.out.println("트롤이 이미 죽은상태입니다.");
			return;
		}
		
		troll.dobattle(this.atk);
		if(troll.getHp() <= 0) {
			this.exp +=15;
			System.out.println("트롤이 죽었습니다.");
			System.out.println("도적가 경험치 : " + this.exp);
		}else {
			this.hp -= troll.getAtk();
		System.out.println("도적의 남은 체력 : " + this.hp);
	}
	}
		public void huntGoblin(Goblin goblin) {
			if(goblin.getHp() <= 0) {
				System.out.println("고블린이 이미 죽은상태입니다.");
				return;
			}
			
			goblin.dobattle(this.atk);
			if(goblin.getHp() <= 0) {
				this.exp +=8;
				System.out.println("고블린이 죽었습니다.");
				System.out.println("도적가 경험치 : " + this.exp);
			}else {
				this.hp -= goblin.getAtk();
			System.out.println("도적의 남은 체력 : " + this.hp);
			}
		}

public int getHp() {
	return hp;
}



public void setHp(int hp) {
	this.hp = hp;
}



public int getMp() {
	return mp;
}



public void setMp(int mp) {
	this.mp = mp;
}



public int getAtk() {
	return atk;
}



public void setAtk(int atk) {
	this.atk = atk;
}



public int getLv() {
	return lv;
}



public void setLv(int lv) {
	this.lv = lv;
}



public int getExp() {
	return exp;
}



public void setExp(int exp) {
	this.exp = exp;
}
}