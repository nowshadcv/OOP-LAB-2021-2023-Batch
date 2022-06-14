package figures;

package figures;

public interface FigureCi {
	double perimeter();
	double area();

}

package figures;

public  class Circle implements FigureCi{
	private double radius;
	public Circle (double r){
		radius=r;}
	public double perimeter(){
		return (2*3.14*radius);}
	public double area(){
		return (3.14*radius*radius);}
}


package figures;
public interface FigureTr {
	int perimeter();
	double area();
}

package figures;

public class Triangle implements FigureTr {
	private int side1 , side2 , side3 ;
	public Triangle(int s1,int s2,int s3){
		side1=s1;
		side2=s2;
		side3=s3;
	}
	public int perimeter (){
		return (side1+side2+side3);
	}
	public double area(){
		double s =(side1+side2+side3)/2;
		double a=Math.sqrt((s-side1)+(s-side2)+(s-side3));
		return a;
	}

}


package figures;

public interface FigureSq {
	int perimeter();
	int area();}


package figures;

public class Square implements FigureSq {
	private int side;
	public Square(int s){
		side=s;}
	public int perimeter (){
		return (4*side);}
	public int area(){
		return (side*side);}
}


package figures;

public class Rectangle implements  FigureSq {
	int length;
	int bredth;
	public Rectangle (int l , int b){
		length = l;
		bredth = b;
	}
	public int perimeter (){
		return (2*(length+bredth));}
	public int area(){
		return (length*bredth);}

}




package Test;
package Test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter side of square :");
		int s=sc.nextInt();
		Square sq = new Square(s);
		System.out.println("perimerter  "+sq.perimeter());
		System.out.println("Area "+sq.area());
		
		System.out.println("Enter radius of circle :");
		Double r=sc.nextDouble();
		Circle ci = new Circle(r);
		System.out.println("perimerter  "+ci.perimeter());
		System.out.println("Area "+ci.area());
		
		System.out.println("Enter side 1 of triangle");
		int s1 = sc.nextInt();
		System.out.println("Enter side 2 of triangle");
		int s2 = sc.nextInt();
		System.out.println("Enter side 3 of triangle");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("perimerter  "+tr.perimeter());
		System.out.println("Area "+tr.area());
		
		System.out.println("Enter length of square :");
		int l=sc.nextInt();
		System.out.println("Enter bredth of square :");
		int b=sc.nextInt();
		Rectangle re = new Rectangle(l,b);
		System.out.println("perimerter  "+re.perimeter());
		System.out.println("Area "+re.area());
		
		

	}

}