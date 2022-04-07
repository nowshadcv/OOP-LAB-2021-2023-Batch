import java.util.Scanner;


public class Addition {
	

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter matrix A row number : ");
		p=s.nextInt();
		System.out.print("Enter matrix A column number : ");
		q=s.nextInt();
		System.out.print("Enter matrix B row number : ");
		m=s.nextInt();
		System.out.print("Enter matrix B column number : ");
		n=s.nextInt();
		
		if (p==m && q == n){
			
			int a[][] =new int[p][q];
			int b[][]=new int[m][n];
			
			System.out.println("enter elements of matrix A");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("enter elements of matrix B");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			
			System.out.println(" matrix A");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					System.out.println(a[i][j]+ " ");
			System.out.println();
			
			System.out.println(" matrix B");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.println(b[i][j]+ " ");
			System.out.println();
			
			System.out.println(" Sum matrix: ");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.println(a[i][j]+b[i][j]+ " ");
			System.out.println();
			
		}
		else{
			System.out.println("These matrices cannot be added");
		}
		
		
	}

}
