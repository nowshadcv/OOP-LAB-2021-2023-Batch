public class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.3;}}
	static class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(){
			return 5.5;}
		}
	}
	
public class CPUDetails {
	public static void main(String[] args){
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor cache="+processor.getCache());
		System.out.println("RAM clock speed="+ram.getClockSpeed());
	}
