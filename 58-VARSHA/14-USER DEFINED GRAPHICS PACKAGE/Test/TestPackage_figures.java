package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter the square of the side");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Peerimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		
		System.out.println("enter the radius of the circle");
		double r=sc.nextDouble();
		Circle ci=new Circle(r);
		System.out.println("Peerimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		
		System.out.println("enter the side1 of triangle:");
		int s1=sc.nextInt();
		System.out.println("enter the side2 of triangle:");
		int s2=sc.nextInt();
		System.out.println("enter the radius of the circle");
		int s3=sc.nextInt();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("Perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());

        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("enter the breadth");
        int b=sc.nextInt();
        Rectangle rc=new Rectangle(l,b);
		System.out.println("Perimeter:"+rc.perimeter());
		System.out.println("Area:"+rc.area());}}
		