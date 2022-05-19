import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
	
}
class Circle implements AP{
	double r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input(){
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		
	}
	public void area(){
		area=pi*r*r;
		System.out.println("Area of circle:"+area);
	}
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("perimeter of circle:"+perimeter);
	}
}
class Rectangle implements AP{
	double l=0,b=0;
	double area,perimeter;
	public void input(){
		Scanner r=new Scanner(System.in);
		l=r.nextDouble();
		b=r.nextDouble();
	}
	public void area(){
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	public void perimeter(){
		perimeter=2*(l+b);
		System.out.println("perimeter of rectangle"+perimeter);
		
	}
}
public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle sc=new Circle();
		Rectangle r=new Rectangle();
		Scanner s=new Scanner(System.in);
		
		System.out.println("1:Area of circle");
		System.out.println("2:Area of rectangle");
		System.out.println("3:perimeter of circle");
		System.out.println("4:perimeter of rectangle");
		System.out.println("5:program termination");
		
		
		lp:while(true){
			System.out.println("make your choice");
			ch=s.nextInt();
			switch(ch){
			case 1:
				System.out.println("enter radious of circle|n");
				sc.input();
				sc.area();
				break;
			case 2:
				System.out.println("enter length and breadth of rectangle");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("enter radious of circle|n");
				sc.input();
				sc.perimeter();
				break;
			case 4:
				System.out.println("enter length and breadth of rectangle");
				sc.input();
				sc.perimeter();
				break;
			case 5:
				break lp;
			default:
				System.out.println("invalid choice");
			}
		}

	}

}
