package Store2;

public class Store {
	
	public double sell(Fruit f) {
		return f.price();
	}
	
		
	public double discount(Fruit f) {
		return f.price()*0.8;
	}


}
