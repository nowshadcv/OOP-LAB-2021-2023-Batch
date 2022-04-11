import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows in matrix A");
		p=sc.nextInt();
		System.out.println("enter the coloumn of matrix A");
		q=sc.nextInt();
		System.out.println("enter number of rows in matrix B");
		m=sc.nextInt();
		System.out.println("enter the coloumn of matrix B");
		n=sc.nextInt();
		
		if(p==m && q==n)
		{
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
		System.out.println("Enter the elemenets of matrix A");
		for(int i=0;i<p;i++)
			for(int j=0;j<q;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter the elemenets of matrix B");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				b[i][j]=sc.nextInt();
		
		
		
		
		
		System.out.println("MATRIX A ..............");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
				System.out.print(a[i][j]+" ");
		System.out.println(" \n");
		}
		System.out.println("MATRIX B ..............");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+ " ");
		System.out.println(" \n");
		}
		
		System.out.println(" THE SUM OF MATRIX:a and B ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
				System.out.print((a[i][j]+b[i][j])+ " ");
		System.out.println("\n ");
		}
		}
		else{
			System.out.print("these matrixes cannot adeed ");
		}

	}

}

