package product;

public class Cars {

public static void main(String[] args) {
Product p1 = new Product();
p1.pname = "bmw";
p1.pcode = "112";
p1.price = 3200000;
System.out.println("the first product is:");
p1.display();
Product p2 = new Product();
p2.pname = "oodi";
p2.pcode = "113";
p2.price = 5000000;
System.out.println("the second product is:");
p2.display();
Product p3 = new Product();
p3.pname = "benz";
p3.pcode = "114";
p3.price = 4000000;
System.out.println("the third product is:");
p3.display();
Product p = p3.getPrice (0)<(p1.price<p2.price ? p1.price : p2.price)?p3:
(p1.price < p2.price ? p1 : p2);
System.out.println("\n displaying product with lowest price:");
p.display();

}

}
