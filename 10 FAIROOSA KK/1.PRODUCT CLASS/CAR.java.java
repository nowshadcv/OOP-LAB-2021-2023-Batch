

package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product("cars123", "Benz" , 3500000);
		System.out.println("displaying p1 ");
		p1.display();
		
		Product p2 = new Product("cars456", "Swift" , 500000);
		System.out.println("displaying p2 ");
		p2.display();
		
		Product p3 = new Product("cars789", "Alto" , 350000);
		System.out.println("displaying p3 ");
		p3.display();

		Product P = p3.getPrice(0) < (p1.price < p2.price ? p1.price : p2.price) ? p3 :(p1.price < p2.price ?p1 :p2);
		System.out.println("\nDisplaying product with lowest price:" );
		P.display();
	}

}