import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP{
	int r=0;
	double pi=3.14 ,  area=0 , perimeter = 0 ;
	public void input(){
		Scanner c =  new Scanner(System.in);
		r = c.nextInt();
	}
	public void area(){
		area = pi * r * r;
		System.out.println("Area of circle is "+ area);
	}
	public void perimeter(){
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle with radius " + r + "is "+ perimeter);

	}
	
}
class Rectangle implements AP{
	int l=0 , h = 0;
	double   area=0 , perimeter = 0 ;
	public void input(){
		Scanner c =  new Scanner(System.in);
		l = c.nextInt();
		h = c.nextInt();

	}
	public void area(){
		area = l * h;
		System.out.println("Area of rectangle is "+ area);
	}
	public void perimeter(){
		perimeter = 2 * (l+h);
		System.out.println("Perimeter of rectangle " + perimeter);

	}
	
}

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of circle");
		System.out.println("2.Perimeter of circle");
		System.out.println("3.Area of rectangle");
		System.out.println("4.Perimeter of rectangle");
		System.out.println("5.Programme termination");
		lp : while(true){
			System.out.println("Make your own choice");
			ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter radius of circle");
					c.input();
					c.area();
					break;
				case 2:
					System.out.println("Enter radius of circle");
					c.input();
					c.perimeter();
					break;
				case 3:
					System.out.println("Enter length and bredth of rectangle");
					r.input();
					r.area();
					break;
				case 4:
					System.out.println("Enter length and bredth of rectangle");
					r.input();
					r.perimeter();
					break;
				case 5:
					System.out.println("Programme terminated succesfully");
					break lp;
				default :
					System.out.println("Enter a valied option");
					

			}

		}


	}

}
IFaceDemoIFaceDemoIFaceDemo
