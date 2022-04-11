public class cars1 {

	public static void main(String[] args) {
		product1 p1=new product1("bmw","112",320000);
		System.out.println("the first product is:");
		p1.display();
	    product1 p2=new product1("mini","114",10000000);
	    System.out.println("the second product is:");
	    p2.display();
	    product1 p3=new product1("maruthi","113",568800);
	    System.out.println("the third product is:");
	    p3.display();
	    product1 p =p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
	    System.out.println("\nDisplying product with lowest price:");
	    p.display();
	    
	    }

}
