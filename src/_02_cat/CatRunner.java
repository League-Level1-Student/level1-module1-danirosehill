package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		
		Cat Lary = new Cat("Lary"); 
		Lary.meow();
		Lary.printName();
		int lives=9;
		while (0 < lives) {
			Lary.kill();
			lives--;
		} 
	}
}
