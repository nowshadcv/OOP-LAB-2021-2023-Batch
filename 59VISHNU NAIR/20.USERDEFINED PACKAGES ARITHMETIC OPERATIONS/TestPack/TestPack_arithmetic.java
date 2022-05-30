package TestPack;
import operations.*;
import java.util.Scanner;
public class TestPack_arithmetic {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first no :" );
			int s=sc.nextInt();
			System.out.println("Enter the second no :" );
			int o=sc.nextInt();
			
			Add sum=new Add(s,o);
			System.out.println("sum is: "+sum.add());
			Sub sq=new Sub(s,o);
			System.out.println("difference is :"+sq.sub());
			Mul mu=new Mul(s,o);
			System.out.println("product is :"+mu.mul());
			Div d=new Div(s,o);
			System.out.println("quoitient is :"+d.div());
			sc.close();
		}

	

	}