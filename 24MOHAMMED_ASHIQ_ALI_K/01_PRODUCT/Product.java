package program1;

public class Product{
	String pcode,pname;
	int price;
	public Program1() {
		
		
	}
	public Product(String pcode,String pname,int price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public void setValues(String pname,String pcode,int price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public String getName(String pname)
	{
		return pname;
	}
	public String getCode(String pcode)
	{
		return pcode;
	}
	public int getPrice()
	{
		return price;
	}
	public void display()
	{
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price);
	}
	//public static void main(String[] args) {
		 //System.out.print("")
		

	//}

}


public class Cars {

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		p1.pcode = "cars123";
		p1.pname = "benz";
		p1.price = 3500000;
		System.out.println("Displaying p1");
		p1.display();
		
		Program1 p2 = new Program1();
		p2.pcode = "cars124";
		p2.pname = "bmw";
		p2.price = 4000000;
		System.out.println("Displaying p2");
		p2.display();
		
		Program1 p3 = new Program1();
		p3.pcode = "cars124";
		p3.pname = "bmw";
		p3.price = 4000000;
		System.out.println("Displaying p2");
		p3.display();
		
		Program1 p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3: (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();	
		}
	//high = (n1 > n2) ? n1 : n2;
	

}