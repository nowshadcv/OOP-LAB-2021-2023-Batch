package product1;

public class Cars {

	public static void main(String[] args) {
		product1 p1=new product1("cars123","Benz",3500000);
		System.out.println("displaying p1");
		p1.display();
		
		product1 p2=new product1("cars456","Swift",500000);
		System.out.println("displaying p2");
		p2.display();
		
		product1 p3=new product1("cars789","vagonR",600000);
		System.out.println("displaying p3");
		p3.display();
		product1 p = p3.getPrice(0)<(p1.price<p2.price?p1.price:p2.price)?p3: (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
	}
}

