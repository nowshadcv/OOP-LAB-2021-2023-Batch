import java.util.Scanner;
public class CPU {
	double price;
	Scanner sc=new Scanner(System.in);
	class Processor{
		double cores;
		String manufacture;
		
		
		
		double getCache(){
			System.out.println("enter the cache value");
			double s=sc.nextDouble();
			
		return s;
	}
	}
 static class RAM{
	 double memmery;
	 String manufactur;
	 double getclockSpeed(){
		 Scanner sc2=new Scanner(System.in);
		 System.out.println("enter the clockspeed  value");
			double v=sc2.nextDouble();
		 return v;
	 }
	 }
 }

public class CPUdetails {
	public static void main(String[] args){
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor Cache ="+ processor.getCache());
		System.out.println("RAM clock speed ="+ram.getclockSpeed());
	}

}

