package figures;

public interface FigureSq {
	int perimeter();
	int area();
}


package figures;

public class Square  implements FigureSq{
	private int side;
	public Square(int s) { side=s;}
	public int perimeter() {return (4*side);}
	public int area() {return (side*side);}
}


package figures;

public interface FigureCi {
	double perimeter();
	double area();
}


package figures;

public class Circle implements FigureCi{
	private  double radius;
	public Circle(double r) {radius = r;}
	public double perimeter(){return (2*3.14*radius);}
	public double area(){return (3.14*radius*radius);}
	

}

package figures;

public interface FigureRec {
	int perimeter();
	int area();

}


package figures;

public class Rectangle implements FigureRec {
	private int length;int breadth;
	public Rectangle(int l,int b) {length=l; breadth=b;}
	public int perimeter() {return (2*length + 2* breadth);}
	public int area() {
		return (length*breadth);}
	}
	




package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square : ");
		int s= sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Perimeter : " + sq.perimeter());
       System.out.println("Area: " + sq.area());
       System.out.println("Enter the radius of circle: ");
       float r=sc.nextFloat();
       Circle ci=new Circle(r);
       System.out.println("Perimeter : " + ci.perimeter());
       System.out.println("Area : " + ci.area());
       
       System.out.println("Enter the side1 of Triangle: ");
       int  s1=sc.nextInt();
       System.out.println("Enter the side2 of Triangle: ");
       int s2=sc.nextInt();
       System.out.println("Enter the side3 of Triangle: ");
       int s3=sc.nextInt();
       Triangle tr=new Triangle(s1,s2,s3);
       System.out.println("Perimeter : " +tr.perimeter());
       System.out.println("Area : " + tr.area());
       System.out.println("enter the length of rectangle:");
       int l= sc.nextInt();
       System.out.println("enter the  breadth of Reactangle: ");
       int b=sc.nextInt();
       Rectangle rec=new Rectangle(l,b);
       System.out.println("perimeter : " + rec.perimeter());
       System.out.println("Area :  " + rec.area());
       sc.close();
       
	}

}
