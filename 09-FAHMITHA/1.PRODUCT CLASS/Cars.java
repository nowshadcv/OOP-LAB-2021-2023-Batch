package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="red car";
		p1.pname="benz";
		p1.price=35000000;
		System.out.println("Displaying p1:");
		p1.display();
		
		Product p2=new Product();
		p2.pcode="blue car";
		p2.pname="bmw";
		p2.price=50000000;
		System.out.println("Displaying p2:");
		p2.display();
		
		Product p3=new Product();
		p3.pcode="white car";
		p3.pname="xuv";
		p3.price=45000000;
		System.out.println("Displaying p3:");
		p3.display();
		
		Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:");
		p.display();
	}

}
