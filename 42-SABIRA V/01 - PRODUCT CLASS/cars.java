package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="car123";
		p1.pname="benz";
		p1.price=3500000;
		System.out.println("display p1: ");
        p1.display();
        
        Product p2=new Product("BMW","CAR354",5000000);
        System.out.println("display p2: ");
        p2.display();
        
        Product p3=new Product("maruthi","CAR567",1500000);
        System.out.println("display p3: ");
        p3.display();
        
        Product p = p3.getPrice(0)<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);

        System.out.println("\nDisplaying product with lowest price:" );
        p.display();
        
        
        
	}

}
