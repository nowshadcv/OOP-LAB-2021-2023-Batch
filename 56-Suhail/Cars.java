package product;

public class Cars {
	
	int temp,largest;

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode ="cars";
		p1.pname = "jaguar";
		p1.price =10000;
		System.out.println("the p1:");
		p1.display();
		
		Product p2 = new Product("BMW" , "i8", 30000);
		System.out.println("the string p2:");
		p2.display();
		
		Product p3 = new Product("suzuki","swift",100000);
		System.out.println("the p3:");
		p3.display();
		
		Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3: (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
	}
}
