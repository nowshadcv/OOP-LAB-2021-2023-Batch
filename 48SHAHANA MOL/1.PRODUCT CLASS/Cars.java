package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="Cars123";
		p1.pname="Benz";
		p1.price=350000;
		System.out.println("Displaying p1: ");
		p1.display();
				
		Product p2=new Product();
		p2.pcode="Cars123";
		p2.pname="Maruti";
		p2.price=200000;
		System.out.println("Displaying p2: ");
		p2.display();
					
		Product p3=new Product();
		p3.pcode="Cars123";
		p3.pname="Swift";
		p3.price=250000;
		System.out.println("Displaying p3: ");
		p3.display();
		Product p = p3.getPrice()<(p1.price<p2.price ? p1.price:p2.price)?p3:
		(p1.price<p2.price?p1:p2);
		System.out.println("\n Displaying product with lowest price: ");
			p.display();
		
	}

}
