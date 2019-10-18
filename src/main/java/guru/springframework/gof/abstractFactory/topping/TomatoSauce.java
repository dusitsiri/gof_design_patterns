package guru.springframework.gof.abstractFactory.topping;

public class TomatoSauce implements Sauce {
	public TomatoSauce() {
		prepareSauce();
	}

	public void prepareSauce() {
		System.out.println("Preparing tomato sauce..");
	}
}