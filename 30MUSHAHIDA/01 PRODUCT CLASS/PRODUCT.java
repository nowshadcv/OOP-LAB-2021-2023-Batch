package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "Cars123" ;
		p1.pname = "Benz" ;
		p1.price= 350000;
		System.out.println("Displaying p1	:");
		p1.display();
		
		Product p2 = new Product();
		p2.pcode = "Cars1234" ;
		p2.pname = "BMW" ;
		p2.price= 400000;
		System.out.println("Displaying p2	:");
		p2.display();
		
		Product p3 = new Product("jagaur","cars12345", 5000000);
		System.out.println("Displaying p3	:");
		p3.display();
		
		Product p = p3.getPrice() < (p1.price < p2.price ? p1.price :p2.price)?p3:(p1.price<p2.price ? p1:p2);
		System.out.println("lowest price is	:");
		p.display();
	}

}

package product;

public class Product {
	String pname,pcode;
	int price;
	public Product() {}
	public Product(String pname,String pcode,int price){
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
public void setPname(String pname){
	this.pname=pname;
}
public void setPcode(String pcode){
	this.pcode=pcode;
}
public void setPrice(int price){
	this.price=price;
}
public String getPname(String pname){
	return pname;
}
public String getPcode(String pcode){
	return pcode;
}
public int getPrice(){
	return price;
}
public void display(){
	System.out.println("pcode	:" + this.pcode);
	System.out.println("pname	:" + this.pname);
	System.out.println("price	:" + this.price + "\n");
} 
}