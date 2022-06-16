import java.util.Scanner;
public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int column = sc.nextInt();	
		System.out.println("Enter "+row+"x"+column+" matrix");
		int matrix[][] = new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The entered matrix is");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		if (row!=column){
			System.out.println("The matrix is not squire matrix");
		}
		else{
			boolean symmetric = true;
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if (matrix[i][j]!=matrix[j][i]){
						symmetric=false;
						break;
					}
					
				}
			}
		if (symmetric){
			System.out.println("Matrix is symmetric");
		}
		else
		{
			System.out.println("Matrix not is symmetric");
		}
		}

	}

}