package cpudetails;

import java.util.Scanner;

public class CPU {

	double price ;
	class Processor {
		Scanner s = new Scanner(System.in);
		double cores;
		String manufacture;
		
		double getChache(){
			return 4.3 ;
		}
	}
	static class RAM {
		double memory ;
		String manufacture;
		double getClockSpeed() {
			return 5.5 ;
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}


package cpudetails;

//import java.awt.SystemColor;


public class CpuDetails {

	public static void main(String[] args) {
		
		CPU cpu = new CPU() ;
		CPU.Processor processor= cpu.new Processor() ;
		CPU.RAM ram = new CPU.RAM() ;
		System.out.println("Processor Cache =" +processor.getChache() ) ;
		System.out.println("RAM Clock speed =" +ram.getClockSpeed()) ;

	}

}
