package Store2;

import Store2.Apple;
import Store2.Client;
import Store2.Store;

public class Client {
	Store s = new Store();

	Fruit a = new Apple();
	double price = s.sell(a);

	public static void main(String[] args) {
		Client c = new Client();
		c.printPrice();
		
		
		
	}
	public void printPrice() {
		System.out.println(price);
	}

}
