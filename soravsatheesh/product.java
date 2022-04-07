package product;

public class Product { 
String pname,pcode ; 
int price ; 
public Product() {} 
public Product(String pname, String pcode, int price) { 
this.pname = pname; 
this.pcode = pcode; 
this.price = price; } 
public void setPname(String pname) { 
this.pname = pname; } 
public String getPcode() { 
return pcode;} 
public String getPname() { 
return pname ;} 
public void setPcode ( String pcode ) { 
this.pcode = pcode ;} 
public int getPrice(){ 
return price ;} 
public void setPrice(int price) { 
this.price = price ;} 
public void display( ) { 
System.out.println("pcode :" + this.pcode); 
System.out.println("pname :" + this.pname); 
System.out.println("price :" + this.price + "\n") ;}} 


package product;

public class cars{
public static void main(String[] args){
Product p1 = new Product();
p1.pcode = "Car123";
p1.pname = "Benz";
p1.price = 10000;
System.out.println("Displaying p1:");
p1.display();
Product p2 = new Product("Jaguar" , "Car426" , 25000 );
System.out.println("Displaying p2: " );
p2.display() ;
Product p3 = new Product ("Maruthi", "Car800", 50000 );
System.out.println( "Displaying p3: ");
p3.display( ) ;
Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3

: (p1.price<p2.price?p1:p2);

System.out.println("\nDisplaying product with lowest price:" );
p.display();
}}