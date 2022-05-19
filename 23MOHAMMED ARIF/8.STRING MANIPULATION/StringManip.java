
public class StringManip {

	public static void main(String[] args) {
		char arrSample[]={'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.print(strSample1+"\t");
		System.out.print("length of"+strSample1+"is"+strSample1.length()+"\n");
		byte ascii[]={65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.print(strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.print(strSample3+"\t");
		String strsample4=strSample1+strSample2;
		System.out.print(strsample4+"\t");
		System.out.print("3rd char of "+strsample4+"is"+strsample4.charAt(2)+"\n");
		char buf[]=new char[3];
		strsample4.getChars(2, 5, buf, 0);
		System.out.println("extracted char"+strsample4+""+new String(buf));
		String strSample="Rockstar";
		System.out.print(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.print(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strSample.equals("ROCKSTAR")+"\t");
		System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar starts with 'ro':"+strSample.startsWith("Ro"));
		System.out.println("Rockstar end  with 'star':"+strSample.endsWith("star"));
		System.out.println("Rockstar contain 'tar':"+strSample.contains("tar"));
		System.out.println("indux of 't'in Rockstar:"+strSample.indexOf("t"));
		System.out.println("indux of 'star'in Rockstar:"+strSample.indexOf("star"));
		System.out.println("ALL caps-Rockstar:"+strSample.toUpperCase());
		System.out.println("ALL small-Rockstar:"+strSample.toLowerCase());
		System.out.println("replace star with et:"+strSample.replace("star", "et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("Double value of dVal:"+Double.valueOf(dVal));
		System.out.println("integer value of iVal:"+Integer.valueOf(iVal));
		double a =Double.valueOf(dVal);
		int b= Integer.valueOf(iVal);
		System.out.println(a+b);
		
		
		
		
		

	}

}
