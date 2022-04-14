package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product("bmw","112",3200000);
		System.out.println(" the first product is:");
		p1.display();
		Product p2 = new Product("oodi","113",500000);
		
		System.out.println(" the second product is:");
		p2.display();
		Product p3 = new Product("mini","114",1000000);
		p3.pname = "mini";
		
		System.out.println(" the third product is:");
		p3.display();



	
	Product p = p3.getPrice(0)<(p1.price<p2.price ? p1.price:p2.price)?p3:
		(p1.price < p2.price ? p1 : p2);
	System.out.println("\n displaying product with lawest price");
	p.display();}
}