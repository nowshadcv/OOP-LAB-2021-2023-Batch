package cpu;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU() ;
		CPU.processor  processor = cpu.new processor() ;
		CPU.RAM ram = new CPU.RAM() ;
		System.out.println("processor Cache = " + processor.getCache() ) ;
		System.out.println("RAM Clock speed = " +ram.getClockSpeed() ) ;
		
		
		
		

	}

}
