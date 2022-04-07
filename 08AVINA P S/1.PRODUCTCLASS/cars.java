package product;

public class cars  {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "Cars123";
		p1.pname = "Benz";
		p1.price = 3500000;
		System.out.println("displaying p1:");
		p1.display();

		Product p2 = new Product("Jaguar","cars456",700000);
		System.out.println("displaying p2:");
		p2.display();
		
		Product p3 = new Product("Maruthi","cars789",1000000);
		System.out.println("displaying p3:");
		p3.display();
		Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
	}

}
