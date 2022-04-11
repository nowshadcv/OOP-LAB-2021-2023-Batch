package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="cars";
		p1.pname="BMW";
		p1.price=100000;
		System.out.println("the first p1 is");
		p1.display();
		
		
		Product p2 = new Product("benz","luxus",200000);
		System.out.println("the p2 display");
		p2.display();
		
		Product p3 = new Product("susuki","rollsroys",2000000);
		System.out.println("the p3 display");
		p3.display();
		
		Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\n displaying product with lowest price");
		p.display();
	}

}

