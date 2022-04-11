package symmetric;
import java.util.Scanner;

public class Symmetric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows");
		int rows = sc.nextInt();
		System.out.println("enter how many cols");
		int cols = sc.nextInt();
		System.out.println("enter the elements");
		int matrix[][] = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("given matrix");
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j] + "\t");

			}
			System.out.println();
		}
		if(rows != cols )
		{
			System.out.println("given matrix is not symmetric no square matrix");
		}
		else
		{
		boolean symmetric = true;
		for(int i=0;i<rows;i++)
			for (int j=0;j<cols;j++)
			if (matrix[i][j] != matrix[j][i])
			{
			 symmetric = false;
			 break;
			}
			if(symmetric)
			{
				System.out.println("given matrix is symmetric");
			}
			else
				System.out.println("given matrix is not symmetric");

		}


	}

}
