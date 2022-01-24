package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		Troll t1 = new Troll();
		Goblin g1 = new Goblin();
		Warrior w1 = new Warrior();
		
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		
		w1.huntGoblin(g1);
		w1.huntGoblin(g1);
		w1.huntGoblin(g1);
		w1.huntGoblin(g1);
			

	}

}
