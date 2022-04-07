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
	
	
public void setPname(String pname) {
	this.pname=pname;	
}
public void setPcode(String pcode){
	this.pcode=pcode;
	
}
public void setPrice(int price){
	this.price=price;
	
}
public String  getPname(String pname){
	 return pname;
}
	
public String  getPcode(String pcode){
	 return pcode;
}

public int  getPrice(){
	 return price;
}
		
public void display(){
	System.out.println("pcode :"+this.pcode);
	System.out.println("pname :"+this.pname);
	System.out.println("price :"+this.price +"\n");
}

	
package product;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
			p1.pcode="cars";
			p1.pname="benz";
			p1.price=100000000;
			System.out.println("the firdt p1 is ");
			p1.display();
			
		Product p2=new Product("cars","bmw",12300);
		System.out.println("the firdt p2 is ");
		p2.display();
		Product p3=new Product("cars","susuki",130000);
		System.out.println("the firdt p3 is ");
		p3.display();
        Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
        System.out.println("\n Displaying product with lowest price");
        p.display();
	}

}


	
}

