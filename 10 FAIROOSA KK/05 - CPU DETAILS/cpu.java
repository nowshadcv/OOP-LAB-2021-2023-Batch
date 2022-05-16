package cpu;
import java.util.Scanner;


public class CPU {
    double price;
    int cache;
    static int clkspd;
    static Scanner sc= new Scanner(System.in);
   
    class Processor{
        double cores;
        String manufacturer;
        double getCache (){
            System.out.println("enter cache value:");
            cache=sc.nextInt();
            return cache;
           
        }
    }
    static class RAM{
        double memory;
        String manufacturer;
        double getClockSpeed(){
            System.out.println("enter clock speed:");
            clkspd=sc.nextInt();
            return clkspd;
        }
    }

}

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