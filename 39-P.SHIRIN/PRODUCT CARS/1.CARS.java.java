package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product("c1","Hecter",400000);
		System.out.println("display p1");
		p1.display();
		
		Product p2 = new Product("c2","mini cooper",500000);
		System.out.println("display p2");
		p2.display();
		
		Product p3 = new Product("c3","Kia",30000);
		System.out.println("display p3");
		p3.display();
		Product p= p3.getPrice(0)<(p1.price<p2.price? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();

	}

}
