package Test1;
import package1.*;
import java.util.Scanner;
public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value for addition:");
		double i=sc.nextDouble();
		System.out.println("Enter the second value for addition:");
		double j=sc.nextDouble();
		Addition a =new Addition(i,j);
		System.out.println("sum :"+a.calculate());
		System.out.println("Enter the first value for subtraction:");
		double c=sc.nextDouble();
		System.out.println("Enter the second value for addition:");
		double d=sc.nextDouble();
		Subtraction s =new Subtraction(c,d);
		System.out.println("difference :"+s.calculate());
		System.out.println("Enter the first value for multiplication:");
		double e=sc.nextDouble();
		System.out.println("Enter the second value for multiplication:");
		double f=sc.nextDouble();
		Multiplication m =new Multiplication(e,f);
		System.out.println("product :"+m.calculate());
		System.out.println("Enter the first value for division:");
		double k=sc.nextDouble();
		System.out.println("Enter the second value for division:");
		double l=sc.nextDouble();
		Division div =new Division(k,l);
		System.out.println("quotient:"+div.calculate());

	}

}
