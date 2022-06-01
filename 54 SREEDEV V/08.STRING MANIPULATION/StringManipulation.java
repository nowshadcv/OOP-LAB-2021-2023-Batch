public class StringManipulation {

	public static void main(String[] args) {
		char arrSample [] = {'R','O','S','E'};
		String strSample1 = new String (arrSample) ;
		System.out.print(strSample1);
		System.out.println("\nLegth of" + strSample1 + "is:" + strSample1.length());
		byte ascii[] = {65,66,67,68,69,70};
		String strSample2 = new String (ascii) ;
		System.out.print(strSample2 + "\n");
		String strSample3 = strSample1.concat(strSample2) ;		
		System.out.println(strSample3 +"\n" );
		String strSample4 = strSample1 + strSample2 ;		
		System.out.print(strSample4 + "\n");
		System.out.println("third char of sample4 is" + strSample4.charAt(2)+ "\n");
		char buf[] = new char[3] ;
		strSample4.getChars(2, 5, buf, 0);
		System.out.println("extracted char:" + strSample4 + "" +new String(buf)+ "\n");
		String sample= "rockstar";
		System.out.print(sample.compareTo("ROCKSTAR")+ "\n");
		System.out.print(sample.compareToIgnoreCase("ROCKSTAR")+ "\n");
		System.out.print(sample.equals("ROCKSTAR")+ "\n");
		System.out.print(sample.equalsIgnoreCase("ROCKSTAR")+ "\n");
		System.out.print("ROCKSTAR start with RO" + sample.startsWith("RO")+ "\n");
		System.out.print("ROCKSTAR end with STAR" + sample.endsWith("STAR")+ "\n");
		System.out.print("ROCKSTAR contains tar" + sample.contains("tar")+ "\n");
		System.out.print("index of 't' in rockstar " + sample.indexOf("t")+ "\n");
		System.out.print("index of 'star' in rockstar " + sample.indexOf("star")+ "\n");
		System.out.print("uppercase rockstar " + sample.toUpperCase()+ "\n");
		System.out.print("lowercase rockstar " + sample.toLowerCase()+ "\n");
		System.out.print("replace start with et " + sample.replace("star", "et")+ "\n");
		String dVal = "3.456";
		String iVal = "6";
		System.out.println("double value of dval is " + Double.valueOf(dVal)+ "\n");
		System.out.println("Integer value of iVal is " + Integer.valueOf(iVal));
	}

}
