package figures;

public interface FigureCi {
	double perimetere();
	double area();
}


package figures;

public class Circle implements FigureCi {
	private double radius;
	public Circle(double r) {
		radius = r;
	}
	public double perimetere() {	
		return (2*3.14*radius);
	}
	public double area() {	
		return (3.14*radius*radius);
	}
}


package figures;

public interface FigureRe {
	int perimetere();
	int area();
}


package figures;

public class Rectangle implements FigureRe {
	private int breadth,length;
	public Rectangle( int b,int l) {
		breadth = b;
		length = l;
	}
	public int perimetere() {
		return (2*(length*breadth));
	}
	public int area() {	
		return (length*breadth);
	}
}


package figures;

public interface FigureSq {
	int perimetere();
	int area();
}


package figures;

public class Square implements FigureSq {
	private int side;
	public Square( int s) {
		side = s;
	}
	@Override
	public int perimetere() {
		return (4*side);
	}

	@Override
	public int area() {
		
		return (side*side);
	}

}


package figures;

public interface FigureTr {
	int perimetere();
	double area();
}

package figures;

public class Triangle implements FigureTr {
	private int side1, side2,side3;
	public Triangle(int s1, int s2, int s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public int perimetere() {
		return side1+ side2+ side3;
	}
	public double area() {
		double s = (side1+ side2+ side3)/2;
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
		
		System.out.println("enter the side of square");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("Perimeter :" + sq.perimetere());
		System.out.println("Area : " + sq.area());

		System.out.println("enter the radius of circle");
		double r = sc.nextDouble();
		Circle ci = new Circle(r);
		System.out.println("Perimeter :" + ci.perimetere());
		System.out.println("Area : " + ci.area());
		
		System.out.println("enter the side1 of Triangle");
		int s1 = sc.nextInt();
		System.out.println("enter the side1 of Triangle");
		int s2 = sc.nextInt();
		System.out.println("enter the side1 of Triangle");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1, s2, s3);
		System.out.println("Perimeter :" + tr.perimetere());
		System.out.println("Area : " + tr.area());
		
		System.out.println("enter the length of Rectangle");
		int l = sc.nextInt();
		System.out.println("enter the breaadth of Rectangle");
		int b = sc.nextInt();
		Rectangle re = new Rectangle(l, b);
		System.out.println("Perimeter :" + re.perimetere());
		System.out.println("Area : " + re.area());
		sc.close();

	}

}