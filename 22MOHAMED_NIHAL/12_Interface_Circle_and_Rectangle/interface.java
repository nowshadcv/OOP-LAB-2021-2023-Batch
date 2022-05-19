import java.util.Scanner;

	interface AP {
	void input();
	void area();
	void perimeter();
	}
	
	class Circle implements AP{
		float r=0;
		double pi=3.14,area=0,perimeter=0;
	public void input() {
		Scanner c = new Scanner(System.in);
		r = c.nextFloat();
		}
	public void area() {
		area = pi*r*r;
		System.out.println("Area of Circle:" +area);
	}
	public void perimeter() {
		perimeter =2*pi*r*r;
		System.out.println("Perimeter of Circle:" +perimeter);	
	}	
}

	class Rectangle implements AP{
		float l = 0, b=0;
		double area=0,perimeter=0;
	public void input() {
		Scanner c = new Scanner(System.in);
		l = c.nextFloat();
		b = c.nextFloat();
		}
	public void area() {
		area = l*b;
		System.out.println("Area of Rectangle:" +area );
	}
	public void perimeter() {
		perimeter = 2 *(l+b) ;
		System.out.println("Perimeter of Rectangle:" +perimeter);	
	}	
}

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Area of Cirle");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Perimeter of Cirle");
		System.out.println("4. Perimeter of Rectangle");
		System.out.println("5. Termination");
	lp : while(true) {
		System.out.print("Make your Choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter the radius of circle \n");
			c.input();
			c.area();
			break;
		case 2:
			System.out.print("Enter the length and breadth of Rectangle \n");
			r.input();
			r.area();
			break;
		case 3:
			System.out.print("Enter the radius of circle \n ");
			c.input();
			c.perimeter();
			break;
		case 4:
			System.out.print("Enter the length and breadth of circle \n");
			r.input();
			r.perimeter();
			break;
		case 5:
			break lp;
			default:
			System.out.print("Invalid choice! please make valid choice \n");
	  }
	}
  }
}
