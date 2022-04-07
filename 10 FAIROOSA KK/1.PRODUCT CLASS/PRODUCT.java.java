PACKAGE.java

package product;

public class Product {
	String pname,pcode;
	int price;
	public Product()  {}
	public Product(String pname, String pcode, int price){
		this.pname = pname;
		this.pcode = pcode;
		this.price = price;
	}
public void setPname(String pname) {
		this.pname = pname;
	}
public void setPcode(String pcode) {
		this.pcode = pcode;
	}
public void setPrice(int price) {
		this.price = price;
	}
public String getPname(String pname) {
		return pname;
	}
public String getPcode(String pcode) {
		return pcode;
	}
public int getPrice(int price) {
		return price;
	}
public void display() {
	System.out.println("pcode :"+ this.pcode);
	System.out.println("pname :"+ this.pname);
	System.out.println("price :"+ this.price + "\n");
}
	
}

CARS.java

package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product("cars123", "Benz" , 3500000);
		System.out.println("displaying p1 ");
		p1.display();
		
		Product p2 = new Product("cars456", "Swift" , 500000);
		System.out.println("displaying p2 ");
		p2.display();
		
		Product p3 = new Product("cars789", "Alto" , 350000);
		System.out.println("displaying p3 ");
		p3.display();

		Product P = p3.getPrice(0) < (p1.price < p2.price ? p1.price : p2.price) ? p3 :(p1.price < p2.price ?p1 :p2);
		System.out.println("\nDisplaying product with lowest price:" );
		P.display();
	}

}
