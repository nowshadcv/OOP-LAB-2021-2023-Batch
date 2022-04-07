package product;

public class Product {
	String pname,pcode;
	int price;
	public Product(String pname, String pcode,int price ) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
		
	}
public void setPname(String pname)
     {
	   this.pname=pname;
	   
     }


public void setpcode(String pcode)
    {
	this.pcode=pcode;

	}
public void setprice(int price)
    {
	this.price=price;
	
    }
public String getpname(String pname)
    {
	return pname;
    }
public String getpcode(String pcode){
	return pcode;
	
}

public int getprice(int price)
 { 
	return price;
 }
  public void display(){
	  System.out.println("pcode:" + this.pcode);
	  System.out.println("pname:" + this.pname);
	  System.out.println("price:" + this.price);
	  
  }
	
		

	}


