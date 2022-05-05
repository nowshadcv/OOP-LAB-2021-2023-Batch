public class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.3;
		}
	}
	static class RAM{
		double memory;
		String manufaturer;
		double getSpeed( ){
			return 5.5;
		}
	}
}


}