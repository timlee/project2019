package Store;

public class Store {
	
	public double sell(Apple a) {
		return a.price();
	}
	
	public double sell(Pinapple p) {
		return p.price();
	}
	
	public double sell(StrawBerry s) {
		return s.price();
	}
	
	public double sell(Orange o) {
		return o.price();
	}
	
	public double discount(Orange o) {
		return o.price()*0.8;
	}
	
	public double discount(Apple a) {
		return a.price()*0.8;
	}
	
	public double discount(Pinapple p) {
		return p.price()*0.8;
	}
	
	public double discount(StrawBerry s) {
		return s.price()*0.8;
	}

}
