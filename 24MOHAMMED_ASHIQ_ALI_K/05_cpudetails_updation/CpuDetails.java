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
