public class CPU1 {
	double price;
	class processor{
		double cores;
		String manufacture;
		double petcache(){
			return 4.3;
	     }
	}
	static class RAM{
		double memory;
		String manufacture;
		double getClockSpeed(){
			return 5.5;
		}
	}
}




public class CPU1Details {
	public static void main(String[]args){
		CPU1 cpu=new CPU1();
		CPU1.processor processor=cpu.new processor();
		CPU1.RAM ram=new CPU1.RAM();
		System.out.println("processsor cache="+processor.petcache());
		System.out.println("RAM Cock speed="+ram.getClockSpeed());
	}

}
