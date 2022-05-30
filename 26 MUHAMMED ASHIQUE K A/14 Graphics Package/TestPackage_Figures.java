package Test;

import figures.*;
import java.util.Scanner;

public class TestPackage_Figures {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the side of Square");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.print("perimeter :"+ sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("enter the radius Circle:");
		int r = sc.nextInt();
		Circle ci =new Circle(r);
		System.out.println("perimeter :"+ci.perimeter());
		System.out.println("Area: " +ci.area());
		
		System.out.println("enter the side1 of Triangle :");
		int s1 = sc.nextInt();
		System.out.println("enter the side2 of Triangle :");
		int s2 = sc.nextInt();
		System.out.println("enter the side3 of Triangle :");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("perimeter : "+ tr.perimeter());
		System.out.println("area : "+ tr.area());
		
		System.out.println("Enter the length of Rectangle");
		int l =sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		int b =sc.nextInt();
		Rectangle rect = new Rectangle(l,b);
		
		System.out.println("Perimter :" + rect.perimeter());
		System.out.println("Area : " + rect.area());
		sc.close();
	}
	
	}
