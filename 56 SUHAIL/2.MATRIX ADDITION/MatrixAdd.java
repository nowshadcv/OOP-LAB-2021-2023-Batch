package matricsadd;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		
		int a,b,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows in Matrix A:");
		a=s.nextInt();
		System.out.println("Enter number of columns in Matrix A:");
		b=s.nextInt();
		System.out.println("Enter number of rows in Matrix B:");
		m=s.nextInt();
		System.out.println("Enter number of columns in Matrix B:");
		n=s.nextInt();
		
		if(a == m && b == n) {
			
			int c[][]=new int[a][b];
			int d[][]=new int[m][n];
			
			System.out.println("Enter the elements of Matrix A:");
			for(int i=0 ; i<a ; i++)
				for(int j=0 ; j<b ; j++)
					c[i][j] = s.nextInt();
			
			System.out.println("Enter the elements of Matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					d[i][j]=s.nextInt();
			
			
			System.out.println("Matrix A:");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++)
					System.out.println(c[i][j]+"");
				System.out.println();}
					
			
			
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.println(d[i][j]+"");
				System.out.println();}

		    System.out.println("The sum Matrix:");
		    for(int i=0;i<m;i++) {
			   for(int j=0;j<n;j++)
				  System.out.print((c[i][j] + d[i][j])+"");
			   System.out.println();
		    }
}
else{
		System.out.println("These matrices cannot be added..");}
}
}
	
