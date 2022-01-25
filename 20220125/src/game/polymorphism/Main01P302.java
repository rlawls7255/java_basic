package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		
	Orc o1 = new Orc();
	Troll t1 = new Troll();
	Goblin g1 = new Goblin();
		
	Warrior w1 = new Warrior("김진");
	
	w1.hunt(o1);
	System.out.println("-------------------------------------");
	w1.hunt(o1);
	System.out.println("-------------------------------------");
	w1.hunt(o1);
	System.out.println("-------------------------------------");
	
	w1.hunt(t1);
	System.out.println("-------------------------------------");
	w1.hunt(t1);
	System.out.println("-------------------------------------");
	w1.hunt(t1);
	System.out.println("-------------------------------------");
	w1.hunt(g1);
	System.out.println("-------------------------------------");
	w1.hunt(g1);


}
}
