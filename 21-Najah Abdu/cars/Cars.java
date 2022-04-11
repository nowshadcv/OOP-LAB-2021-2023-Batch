package cars;

import product.Product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product("BMW","112",320000);
		System.out.println("the first product is:");
		p1.display();
	}

}
