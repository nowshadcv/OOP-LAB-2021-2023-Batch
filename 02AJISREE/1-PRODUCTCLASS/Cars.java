package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode="cars123";
		p1.pname="benz";
		p1.price=3500000;
		System.out.println("displaying p1:");
		p1.display();
		
		Product p2 = new Product();
		p2.pcode="cars123";
		p2.pname="jaguar";
		p2.price=500000;
		System.out.println("displaying p2:");
		p2.display();
	
		Product p3=new Product("maruthi","car1234",600000);
		System.out.println("displaying p3");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		
		
	}

}
