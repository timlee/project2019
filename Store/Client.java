package Store;

public class Client {

	Store s = new Store();

	double price;

	public static void main(String[] args) {

		Client c = new Client();
		c.printPrice();
		
		
		
	}
	public void printPrice() {
		Apple a = new Apple();
		price = s.sell(a);
		System.out.println(price);
	}

}
