package figures;

public interface FigureCi
{
	double perimeter();
	double area();
}


package figures;

public class Circle implements FigureCi
{
	private double radius;
	public Circle(double r)
	{
		radius = r;
	}
	public double perimeter()
	{
		return (2*3.14*radius);
	}
	public double area()
	{
		return (3.14*radius*radius);
	}

}


package figures;

public interface FigureRe {
	int perimeter();
	int area();
}


package figures;

public class Rectangle {
	private int side1;int side2;
	public Rectangle(int s11, int s21)
	{
		side1 = s11; side2 = s21;
	}
	public int perimeter()
	{
		return (2*(side1+side2));
	}
	public int area()
	{
		return(side1*side2);
	}

}


package figures;

public interface FigureSq 
{
	int perimeter();
	int area();

}


package figures;

public class Square implements FigureSq{
	private int side;
	public Square(int s)
	{
		side = s;
	}
	public int perimeter()
	{
		return (4*side);
	}
	public int area()
	{
		return(side*side);
	}

}


package figures;

public interface FigureTr {
	int perimeter();
	double area();
}


package figures;

public class Triangle implements FigureTr {
	private int side1,side2,side3;
	public Triangle(int s1,int s2,int s3)
	{
		side1 = s1; side2 = s2; side3 = s3;
	}
	public int perimeter()
	{
		return side1+side2+side3;
	}
	public double area()
	{
		double s = (side1+side2+side3)/2;
		double a = Math.sqrt((s-side1)+(s-side2)+(s-side3));
		return a;
	}

}


package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square : ");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("perimeter : " + sq.perimeter());
		System.out.println("Area :b " +sq.area());
		
		System.out.println("Enter the radius of circle : ");
		int r = sc.nextInt();
		Circle ci =new Circle(r);
		System.out.println("Perimeter : " + ci.perimeter());
		System.out.println("Area : " + ci.area());
		
		System.out.println("Enter the side1 of Triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the side2 of Triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the side3 of Triangle : ");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("Perimeter : " + tr.perimeter());
		System.out.println("Area : " + tr.area());	
		
	
		System.out.println("Enter the side1 of Rectangle : ");
		int s11 = sc.nextInt();
		System.out.println("Enter the side2 of Rectangle : ");
		int s21 = sc.nextInt();
		Rectangle re = new Rectangle(s11,s21);
		System.out.println("Perimeter : " + re.perimeter());
		System.out.println("Area : " + re.area());
	}

}

