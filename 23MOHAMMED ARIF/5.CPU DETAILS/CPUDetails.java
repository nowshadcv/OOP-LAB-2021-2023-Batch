package cpudetails;

public class CPUDetails {
	

	public static void main(String[] args) {
		Cpu cpu=new Cpu();
		Cpu.Processor processor = cpu.new Processor();
		Cpu.RAM ram=new Cpu.RAM();
		System.out.println("processor cache ="+ processor.getCache());
		System.out.println("RAM Clock speed ="+ ram.getClockSpeed());

	}

}
