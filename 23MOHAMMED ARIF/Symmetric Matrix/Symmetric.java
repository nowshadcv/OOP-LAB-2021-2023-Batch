import java.util.Scanner;;
public class Symmetric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the number of rows");
		int rows=sc.nextInt();
		System.out.println("entr the columns");
		int cols=sc.nextInt();
		int metrix[][]=new int [rows][cols];
		System.out.println("enter the elements of metrix");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				metrix[i][j]=sc.nextInt();
		System.out.println("the given metrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
				System.out.print(metrix[i][j]+"\t");
		System.out.println();
		}
		if(rows !=cols)
			System.out.println("this is not a squre matrix");
		else {
			boolean symmetric = true;
			for (int i=0;i<rows;i++)
				for(int j=0;j<cols;j++)
		if(metrix[i][j] != metrix[j][i])
		{
			symmetric =false;break;
		}
		if(symmetric)
			System.out.println("the given metrix is symmetric  ");
		else
			System.out.println("the given metrix not a symmetric");
		
		}

	}

}
