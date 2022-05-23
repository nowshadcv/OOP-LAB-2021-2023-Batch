package Test;
import figuers.*;
import java.util.Scanner;


public class TestPackage_figuers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the side of square: ");
			int s = sc.nextInt();
			Square sq = new Square(s);
			System.out.println("perimeter : " +sq.perimeter());
			System.out.println("Area:"+sq.area());
			System.out.println("enter the radius of circle: ");
			double r = sc.nextDouble();
			Circle ci = new Circle(r);
			System.out.println("perimeter : " +ci.perimeter());
			System.out.println("Area:"+ci.area());
			System.out.println("enter the side1 of triangle: ");
			int s1 = sc.nextInt();
			System.out.println("enter the side2 of triangle: ");
			int s2 = sc.nextInt();
			System.out.println("enter the side3 of triangle: ");
			int s3 = sc.nextInt();
			Triangle tr = new Triangle(s1, s2, s3);
			System.out.println("perimeter : " +tr.perimeter());
			System.out.println("Area:"+tr.area());
			System.out.println("enter the length of rectangle: ");
			int l = sc.nextInt();
			System.out.println("enter the bredth of rectangle: ");
			int b = sc.nextInt();
			Rectangle rc = new Rectangle(l, b);
			System.out.println("perimeter : " +rc.perimeter());
			System.out.println("Area:"+rc.area());
			sc.close();
			
	}

}
