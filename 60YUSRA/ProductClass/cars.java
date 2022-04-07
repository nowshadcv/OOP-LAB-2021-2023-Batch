package product;

public class cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "cars123";
		p1.pname = "Benz" ;
		p1.price = 3500000;
		System.out.println("Displaying p1: ");
		p1.display();
		
		Product p2 = new Product("Jagvar","cars426",500000);
		System.out.println("Displaying p2: ");
		p2.display();
		 
		Product p3 = new Product("Maruthi","cars800",300000);
		System.out.println("Displaying p3: ");
		p3.display();
		Product P = p3.getPrice(0)<(p1.price<p2.price ? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\n displaying product with lowest cost:");
		P.display();

	}

}
