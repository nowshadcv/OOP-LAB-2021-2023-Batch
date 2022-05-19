import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP  {

	double r=0;
	double pi=3.14,area=0;
	public void input()
	{
		Scanner c=new Scanner(System.in);
		r=c.nextDouble();
	}
	
public void area()
{
	area=pi*r*r;
	System.out.println("Area of circle is "+area);
}
public void perimeter()
{
	double perimeter = 2*pi*r;
	System.out.println("perimeter of circle"+perimeter);
}
}
class Rectangle implements AP{
	double l=0,b=0;
	double area,perimeter;
	
	public void input()
	{
		Scanner r=new Scanner(System.in);
		l=r.nextDouble();
		b=r.nextDouble();
	}
	
public void area()
{
	area=l*b;
	System.out.println("Area of rectangle is "+area);
}
public void perimeter()
{
	double perimeter = 2*(l+b);
	System.out.println("perimeter of Rectangle is"+perimeter);
}	


	}


