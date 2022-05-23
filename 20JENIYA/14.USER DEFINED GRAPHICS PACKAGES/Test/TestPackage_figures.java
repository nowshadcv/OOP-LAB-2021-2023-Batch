package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		double s=sc.nextDouble();
		Square sq=new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("Enter the radius of circle:");
		double r=sc.nextDouble();
		Circle ci=new Circle(r);
		System.out.println("Perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		System.out.println("Enter the side1 of Traingle:");
		double s1=sc.nextDouble();
		System.out.println("Enter the side2 of Traingle:");
		double s2=sc.nextDouble();
		System.out.println("Enter the side3 of Traingle:");
		double s3=sc.nextDouble();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("Perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());
		System.out.println("Enter the length of Rectangle:");
		double l=sc.nextDouble();
		System.out.println("Enter the breadth of Rectangle:");
		double b=sc.nextDouble();
		Rectangle rect=new Rectangle(l,b);
		System.out.println("Perimeter:"+rect.perimeter());
		System.out.println("Area:"+rect.area());

	}

}
