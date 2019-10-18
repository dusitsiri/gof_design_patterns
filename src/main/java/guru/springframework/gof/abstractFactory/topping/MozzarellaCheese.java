package guru.springframework.gof.abstractFactory.topping;

public class MozzarellaCheese implements Cheese {
	
	public MozzarellaCheese() {
		prepareCheese();
	}

	public void prepareCheese() {
		System.out.println("Preparing mozzarella cheese...");
	}
}