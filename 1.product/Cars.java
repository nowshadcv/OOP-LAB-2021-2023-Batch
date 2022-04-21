package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "Cars123";
		p1.pname = "Benz";
		p1.price = 350000;
		System.out.println("Display p1: ");
		p1.display();
		
		Product p2 = new Product();
		p2.pcode = "Cars426";
		p2.pname = "BMW";
		p2.price = 400000;
		System.out.println("Display p2: ");
		p2.display();
		
		Product p3 = new Product("jaguar","cars875",600000);
		System.out.println("Display p3: ");
		p3.display();
		
		Product p = p3.getPrice()<(p1.price<p2.price ? p1.price : p2.price)?p3:(p1.price<p2.price?p1:p2);		

	}

}