package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="cars123";
		p1.pname="Benz";
		p1.price=3500000;
		System.out.println("Displaying p1: ");
		p1.display();
		
		Product p2=new Product("Jaguar","cars426" ,5000000);
		System.out.println("Displaying p2: ");
		p2.display();
		
		Product p3=new Product("Maruthi" ,"car800",100000);
		System.out.println("Dispalying p3: ");
		p3.display();
		Product p= p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:");
		p.display();
	}
	

}
