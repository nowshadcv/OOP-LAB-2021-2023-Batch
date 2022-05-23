package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the side of square");
		int s=sc.nextInt();
		Squre sq=new Squre(s);
		System.out.println("Perimeter :"+sq.perimeter());
		System.out.println("Area :"+sq.area());
		
		
		System.out.println("Enter the radious of Circle");
		double r=sc.nextDouble();
		Circle ci=new Circle(r);
		System.out.println("Perimeter :"+ci.perimeter());
		System.out.println("Area :"+ci.area());
		
		
		
		System.out.println("Entre side1 of Triangle:");
		int s1=sc.nextInt();
		System.out.println("Entre side2 of Triangle:");
		int s2=sc.nextInt();
		System.out.println("Entre side3 of Triangle:");
		int s3=sc.nextInt();
		Triangle tr =new Triangle(s1, s2, s3);
		System.out.println("Perimeter :"+tr.perimeter());
		System.out.println("Area :"+tr.area());
		
		
		System.out.println("Entre side1 of Rectangle:");
		int l=sc.nextInt();
		System.out.println("Entre side2 of Rectaangle:");
		int b=sc.nextInt();
		Rectangle re=new Rectangle(l, b);
		System.out.println("Perimeter :"+re.perimeter());
		System.out.println("Area :"+re.area());
		
		
		
		
		
	}

}
