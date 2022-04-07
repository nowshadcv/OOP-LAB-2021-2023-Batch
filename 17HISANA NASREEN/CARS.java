package product1;

public class Cars {

	public static void main(String[] args) {
		Product1 p1=new Product1("car123","benz",3500000);
		System.out.println("display p1");
		p1.display();
		Product1 p2=new Product1("car124","audi",4500000);
		
		System.out.println("display p2");
		p2.display();
		Product1 p3=new Product1("car125","maruti",300000);
		System.out.println("display p3");
		p3.display();
		Product1 p=p3.getPrice(0)<(p1.price<p2.price? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		

	}

}
