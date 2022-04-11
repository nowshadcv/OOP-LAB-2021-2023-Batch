package matricsAddiction;
import java.util.Scanner;

public class Addiction {
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int w,q,s,n;
		Scanner a=new Scanner(System.in);
		System.out.print("enter number of of rows in matrix A:");
		w=a.nextInt();
		System.out.print("enter number of of columns in matrix A:");
		q=a.nextInt();
		System.out.print("enter number of of rows in matrix B:");
		s=a.nextInt();
		System.out.print("enter number of of columns in matrix B:");
		n=a.nextInt();
		
		if(w==q&&s==n)
		{
			int c[][]=new int[w][q];
			int b[][]=new int[s][n];
			System.out.println("enter the element of matrix A:");
			for(int i=0;i<w;i++)
				for(int j=0;j<q;j++)
					c[i][j]=a.nextInt();
			System.out.println("enter the element of matrix B:");
			for(int i=0;i<s;i++)
				for(int j=0;j<n;j++)
					b[i][j]=a.nextInt();
			
			System.out.println("matrix A:");
			for(int i=0;i<w;i++){
				for(int j=0;j<q;j++)
					System.out.print(c[i][j]+"  ");
			System.out.println(" ");
		}
			System.out.println("matrix B:");
			for(int i=0;i<s;i++){
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+"  ");
			System.out.println(" ");
		}
			System.out.println("the sum matrix:");
			for(int i=0;i<s;i++){
				for(int j=0;j<n;j++)
					System.out.print(c[i][j]+b[i][j]+" ");
			System.out.println(" ");
		}
		}
			
		else
			{
				System.out.println("not added");
			}
			
		}
		
		
	}




