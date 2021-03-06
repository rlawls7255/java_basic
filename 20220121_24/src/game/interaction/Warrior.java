package game.interaction;

public class Warrior {
	// Warrior 의 특성으로
	// 체력 마나 공격력 경험치 레벨을 넣어주세요
	
	private int hp;
	private int mp;
	private int atk;
	private int lv;
	private int exp;
	
	
	// 생성자를 생성해서 아무것도 입력받지 않고
	// 체력은 20 마나는 10 공격력은 4 레벨은 1 경험치는 0
	public Warrior() {
		this.hp=20;
		this.mp = 10;
		this.atk = 4;
		this.lv = 1;
		this.exp = 0;
	}
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습ㄴ디ㅏ.
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
			System.out.println("전사의 경험치 : " + this.exp);
		}else {
		// 오크 공격력 만큼 자신의 체력을 차감해줍니다.
		this.hp -= orc.getAtk();
        System.out.println("전사의 남은 체력 : " + this.hp);}
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
				System.out.println("전사가 경험치 : " + this.exp);
			}else {
				this.hp -= troll.getAtk();
			System.out.println("전사의 남은 체력 : " + this.hp);
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
					System.out.println("전사가 경험치 : " + this.exp);
				}else {
					this.hp -= goblin.getAtk();
				System.out.println("전사의 남은 체력 : " + this.hp);
				}
		
	}
	// 타 몬스터 쪽에서 정보를 


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
