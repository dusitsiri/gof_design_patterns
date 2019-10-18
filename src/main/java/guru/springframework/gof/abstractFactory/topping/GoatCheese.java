package guru.springframework.gof.abstractFactory.topping;

public class GoatCheese implements Cheese {
	public GoatCheese() {
		prepareCheese();
	}
	
	public void prepareCheese() {
		System.out.println("Preparing goat cheese...");
	}
}