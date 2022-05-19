package product;

public class Car {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "Cars123";
		p1.pname = "Benz";
		p1.price = 3500000;
		System.out.println("Displaying p1: ");
		p1.display();
		
		Product p2 = new Product();
		p2.pcode = "Cars1234";
		p2.pname = "Jaquar";
		p2.price = 7500000;
		System.out.println("Displaying p2: ");
		p2.display();
		
		Product p3 = new Product("Car12345","BMW",5000000);
		System.out.println("Displaying p3: ");
		p3.display();
		
		Product p = p3.getPrice() < (p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
        System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		
	}

}