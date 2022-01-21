package accessmodifier;

public class Commoner {
	// private 요소는 자식쪽에서조차 조회나 수정이 불가능합니다,
	// 보안성이 제일 뛰어나기 떄문에 private를 써서 변수를 처리하는 경우가 많은데
	// 이 경우 setter , getter들을 이용해 보조합니다,
	
	private int hp;
	private int mp;
	private int lv;
	private int exp;
	private String name;
	
	public Commoner(String name) {
		this.hp = 20;
		this.mp = 10;
		this.lv=1;
		this.exp = 0;
		this.name=name;
	}
	// setter/getter의 기본형을 만드는 방법은
		// 마우스 우클릭 -> source -> generate   getter/setters를 선택해

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
