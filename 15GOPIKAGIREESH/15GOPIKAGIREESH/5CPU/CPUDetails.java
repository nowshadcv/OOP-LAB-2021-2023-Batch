package cpu;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU() ;
		CPU.Processor processor = cpu.new Processor() ;
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor cache=" + processor.getCache());
		System.out.println("RAM clock speed=" + ram.getClockSpeed());
	}

	}


