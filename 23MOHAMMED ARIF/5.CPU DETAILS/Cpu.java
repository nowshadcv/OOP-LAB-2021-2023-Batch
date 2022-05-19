package cpudetails;
import java.util.Scanner;

public class Cpu {
	
	double price;
	class Processor{
		double cores;
		String manufacture;
		double getCache(){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the value of processor cache:");
			int ar=sc.nextInt();
			return ar;
		}
	}
	static class RAM{
		double memory;
		String manufacture;
		double getClockSpeed(){
			Scanner sd=new Scanner(System.in);
			
			System.out.println("enter the value of RAM clock speed:");
			int br=sd.nextInt();
			
			return br;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
