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
public String getPname(){
	return pname;
}
public String getPcode(){
	return pcode;
}
public int getPrice(){
	return price;
}
public void display(){
	System.out.println("pcode:"+this.pcode);
	System.out.println("pname:"+this.pname);
	System.out.println("price:"+this.pname + "\n");
}


}
