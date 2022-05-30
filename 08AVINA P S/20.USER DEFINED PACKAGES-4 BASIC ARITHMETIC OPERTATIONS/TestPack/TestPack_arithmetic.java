package TestPack;
import arithmetic.*;
import java.util.Scanner;

public class TestPack_arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no :" );
		int s=sc.nextInt();
		System.out.println("Enter the second no :" );
		int o=sc.nextInt();
		
		Add sum=new Add(s,o);
		System.out.println("sum is: "+sum.addition());
		Sub sq=new Sub(s,o);
		System.out.println("difference is :"+sq.substraction());
		Multi mu=new Multi(s,o);
		System.out.println("product is :"+mu.multiplication());
		Div d=new Div(s,o);
		System.out.println("quoitient is :"+d.division());
		sc.close();
	}

}
