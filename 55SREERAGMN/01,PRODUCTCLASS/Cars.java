package products;

public class Cars {

	public static void main(String[] args) {
		Products p1=new Products();
		p1.pcode = "Cars123";
		p1.pname="Benz";
		p1.price=3500000;
		System.out.println("Dispalay p1: ");
		p1.display();
		
		Products p2=new Products();
		p2.pcode = "Cars426";
		p2.pname="Bmw";
		p2.price=4000000;
		System.out.println("Dispalay p1: ");
		p2.display();
		
		Products p3=new Products("jagaur", "cars875",6000000);
		System.out.println("Dispalay p3: ");
		p3.display();
		Products p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3: (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		

			
		

	}

}
