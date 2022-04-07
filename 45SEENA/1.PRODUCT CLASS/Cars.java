package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "12233";
		p1.pname ="Benz";
		p1.price = 35000000;
		System.out.println("Displaying p1: ");
		p1.display();
		
		Product p2 = new Product("jaguar","23432",5000000);
		System.out.println("Displaying p2: ");
		p2.display();
		
		Product p3 = new Product("Alto","4432",7000000);
		System.out.println("Displaying p3: ");
		p3.display();
		
		Product p=p3.getPrice()<(p1.price<p2.price? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		

		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
	}

}
