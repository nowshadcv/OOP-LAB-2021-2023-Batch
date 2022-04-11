
package symmatrix;
import java.util.Scanner;

public class Symmetricmatrix {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int rows=sc.nextInt();
	System.out.println("Enter the number of coloumn");
	int cols=sc.nextInt();
	int matrix[][]=new int[rows][cols];
	System.out.println("enter the element of the matrix");
	for(int i=0;i<rows;i++)
		for(int j=0;j<cols;j++)
			matrix[i][j]=sc.nextInt();
	System.out.println("the given matrix is");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
			System.out.print(matrix[i][j]+ " ");
		System.out.println(" ");	
	}
	if(rows!=cols)
		System.out.println("the given matrix is not Square matrix ");
	else
	{
		boolean symmetric=true;
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				if(matrix[i][j]!=matrix[j][i])
				{
					symmetric=false;
					break;
				
				}
	
		if(symmetric)
		{
					System.out.println("thr given matrix symmetic");
				}
		else
		{
			System.out.println("thr given matrix not symmetic");
		}
	}

}
}

