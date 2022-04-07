package product;

public class Product {
	String pname,pcode;
	int price;
	public Product() { }
	public Product(String pname,String pcode,int price){
		this.pname =pname;
		this.pcode =pcode;
				
	}
public void setPname(String pname){
	this.pname=pname;
}
public void setPcode(String pcode){
	this.pcode=pcode;
}
public void setPrice(int price){
	this.price = price;
}
public String getPname(String pname){
	return pname;
}
public String getPcode(String pcode){
	return pcode;
}
public int getPrice(int price){
	return price;
}
public void display(){
	System.out.println("pcode :" + this.pcode);
	System.out.println("pname :" + this.pcode);
	System.out.println("price :" + this.price + "\n");
	}
	
}





package product;

public class Cars {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pcode = "cars123";
		p1.pname = "benz";
		p1.price = 35000000;
		System.out.println("Displaying p1:  ");
		p1.display();
		
		Product p2 = new Product();
		p2.pcode = "cars124";
		p2.pname = "audi";
		p2.price = 25000000;
		System.out.println("Displaying p2:  ");
		p2.display();

		Product p3 = new Product("alto","car125",500000);
		System.out.println("Displaying p3:  ");
		p3.display();
		
		Product p= p3.getPrice(0)<(p1.price<p2.price?p1.price:p2.price)?p3:
			(p1.price<p2.price? p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
	}

}
