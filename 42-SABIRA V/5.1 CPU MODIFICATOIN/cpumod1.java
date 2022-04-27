package cpu;
import java.util.Scanner;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor cache="+ processor.getCache()+"KB Units");
		System.out.println("ram clock sped="+ram.getClockSpeed()+"Seconds");
		

	}

}