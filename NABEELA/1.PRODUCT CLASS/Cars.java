package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="cars123";
		p1.pname="benz";
		p1.price=350000;
		System.out.println("displaying p1:");
		p1.display();
		
		Product p2=new Product("jaguar","cars426",500000);
		System.out.println("displaying p2");
		p2.display();
		
		Product p3=new Product("maruti","cars453",100000);
		System.out.println("displaying p3");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price ?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\ndisplaying poduct with lowest price:");
		p.display();
		
	}

}
