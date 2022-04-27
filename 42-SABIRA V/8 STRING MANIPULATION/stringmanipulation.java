package cpu;
import java.util.Scanner;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor=cpu.new Processor();
	package stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		char arrSample[]={'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.print(strSample1 + "\t");
		System.out.println("length of "+strSample1 +" is "+strSample1.length());
        byte ascii[]={65,66,67,68,69,70};
        String strSample2=new String(ascii);
        System.out.print(strSample2 + "\t");
        String strSample3=strSample1.concat(strSample2);
        System.out.print(strSample3+"\t");
        String strSample4=strSample1+strSample2;
        System.out.print(strSample4+"\t");
        System.out.println("3rd char of "+strSample4+" is "+strSample4.charAt(2));
        char buf[]=new char[3];
        strSample4.getChars(2, 5, buf, 0);
        System.out.println("extracted char: "+strSample4+""+new String(buf));
        String strSample="RockStar";
        System.out.print(strSample.compareTo("ROCKSTAR")+"\t");
        System.out.print(strSample.compareToIgnoreCase("ROCKSTAR"+"\t"));
        System.out.print(strSample.equals("ROCKSTAR")+"\t");
        System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
        System.out.println("Rockstar starts with 'Ro':"+strSample.startsWith("Ro"));
        System.out.println("Rockstar ends with 'star':"+strSample.endsWith("star"));
        System.out.println("Rockstar contains 'tar':"+strSample.contains("tar"));
        System.out.println("index of 't' in RockStar:"+strSample.indexOf("t"));
        System.out.println("index of 'star' in RockStar:"+strSample.indexOf("star"));
        System.out.println("all caps- RockStar:"+strSample.toUpperCase());
        System.out.println("all small- RockStar:"+strSample.toLowerCase());
        System.out.println("replace star with et: "+strSample.replace("star", "et"));
        String dVal="3.456";
        String iVal="6";
        System.out.println("Double value of dVal is :"+Double.valueOf(dVal));
        System.out.println("Integer value of iVal is :"+Integer.valueOf(iVal));
        double a =Double.valueOf(dVal);
        int b= Integer.valueOf(iVal);
        System.out.println(a+b);    
	}

}
	CPU.RAM ram=new CPU.RAM();
		System.out.println("processor cache="+ processor.getCache()+"KB Units");
		System.out.println("ram clock sped="+ram.getClockSpeed()+"Seconds");
		

	}

}