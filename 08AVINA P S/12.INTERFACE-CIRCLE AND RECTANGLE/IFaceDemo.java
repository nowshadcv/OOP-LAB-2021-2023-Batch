import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();
}
 class Circle implements AP{
	 int r=0;
	 double pi=3.14,area=0,perimeter=0;
	 public void input(){
		 Scanner c=new Scanner(System.in);
		 r=c.nextInt();}
	 public void area() {
		 area=pi*r*r;
		 System.out.println("Area of circle:"+area);
		 }
	 public void perimeter() {
		 perimeter= 2*pi*r;
		 System.out.println("perimeter of circle:"+perimeter);
	 }
	 }
 class Rectangle implements AP{
	 int l=0,b=0;
	 double area,perimeter;
	 public void input() {
		 Scanner r=new Scanner(System.in);
		 l=r.nextInt();
		 b=r.nextInt();}
	 public void area() {
		 area=l*b;
		 System.out.println("Areab of rectangle:"+area);}
	 public void perimeter() {
		 perimeter=2*(l+b);
		 System.out.println("perimeter of rectangle:"+perimeter);
	 }
 }

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Area of circle");
		System.out.println("2.Area of rectangle");
		System.out.println("3.perimeter of circle");
		System.out.println("4.perimeter of rectangle");
		System.out.println("5.program termination");
		
		
		lp:while(true) {
			System.out.println("make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the circle\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the length and breadth of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the radius of the circle\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the length and breadth of the rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
				default:
					System.out.println("Invalid choice! please make a valid choice");
			}
		}
	}

}
