import java.util.Scanner;
class MyException extends Exception{
	public MyException(String str){System.out.print(str);}
}
public class SignException {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Input N : ");
			int N =s.nextInt();
			int sum=0;
			for (int i =0;i<N;i++){
				System.out.println("Input number "+(i+1)+" : ");
				int num = s.nextInt();
				try {
					if (num<0) throw new MyException("Number is negetive");
				}
				catch (MyException m){System.out.println(m); i--; continue ;}
				sum=sum+num;}
			System.out.println("Average of entered number: "+ (double)sum/N);
		
	}

}