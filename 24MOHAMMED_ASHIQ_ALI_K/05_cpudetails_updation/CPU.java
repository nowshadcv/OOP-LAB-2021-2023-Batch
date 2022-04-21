package cpudetails;

import java.util.Scanner;

public class CPU {

	double price ;
	class Processor {
		Scanner s = new Scanner(System.in);
		double cores;
		String manufacture;
		
		double getChache(){
			System.out.println("enter the cache");
			int cache = s.nextInt();
			return cache;
		}
	}
	static class RAM {
		Scanner s = new Scanner(System.in);
		double memory ;
		String manufacture;
		double getClockSpeed() {
			System.out.println("enter the clock speed");
			int clk = s.nextInt();
			return clk;
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
