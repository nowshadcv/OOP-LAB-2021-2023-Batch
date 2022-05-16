package program;
import java.util.Scanner;

public class MatrixAddition{

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("enter rows in matrix a");
		p=s.nextInt();
		System.out.print("enter cols in matrix a");
		q=s.nextInt();
		System.out.print("enter rows in matrix b");
		m=s.nextInt();
		System.out.print("enter rows in matrix b");
		n=s.nextInt();
		
		if(p == m && q ==n)
		{
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			
			System.out.println("enter the elements of matrix a");
			for (int i=0;i<p;i++)
				for(int j = 0;j < q; j++)
					a[i][j] = s.nextInt();
			
			System.out.println("enter the elements of matrix b");
			for (int i=0;i<m;i++)
				for(int j = 0;j < n; j++)
					b[i][j] = s.nextInt();
			
			System.out.println("Matrix A");
			for (int i=0;i<p;i++)
			{
				for(int j = 0;j < q; j++)
					System.out.print(a[i][j]);
				System.out.println();
			}
			
			System.out.println("Matrix B");
			for (int i=0;i<m;i++)
			{
				for(int j = 0;j < n; j++)
					System.out.print(b[i][j]);
				System.out.println();
			}
			
			System.out.println("sum matrix");
			for (int i=0;i<m;i++)
			{
				for(int j = 0;j < n; j++)
					System.out.print(a[i][j]+b[i][j]);
				System.out.println();
			}
		}
		else
		{
			System.out.println("these matries cannot addes");
		}

	}

}
