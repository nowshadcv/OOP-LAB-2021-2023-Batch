package product;

public class Cars {
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.pcode = "cars123";
		p1.pname = "BMW";
		p1.price= 1 ;
		System.out.println("Displaying p1 : ");
		p1.display();
		
		
		Product p2 = new Product("abc","jaguar",1000000);
		System.out.println("Displaying p2 : ");
		p2.display();
		
		Product p3 = new Product("efg","TATA",100000);
		System.out.println("Displaying p3 : ");
		p3.display();
		
Product P = p3.getPrice(0)<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		
  System.out.println("\nDisplaying product with lowest price:" );
  P.display();
     }
}

	
	

        
		

