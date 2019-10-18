package guru.springframework.gof.abstractFactory.topping;

public class CaliforniaOilSauce implements Sauce {
	public CaliforniaOilSauce() {
		prepareSauce();
	}

	public void prepareSauce() {
		System.out.println("Preparing california oil sauce..");
	}
}