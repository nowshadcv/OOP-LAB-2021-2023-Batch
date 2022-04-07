package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "cars123";
		p1.pname = "benz";
		p1.price = 3500000;
		System.out.println("Displaying p1: ");
		p1.display();
		
		
		Product p2 = new Product("jaguar","cars426",5000000);
		System.out.println("Displaying p2: ");
		p2.display();
		
		Product p3 = new Product("Tata","car245",400000);
		System.out.println("Displaying p3: ");
		p3.display();
		
		Product P = p3.getPrice(0)<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);

		System.out.println("\nDisplaying product with lowest price:" );
		P.display();
		
		}
	

}
