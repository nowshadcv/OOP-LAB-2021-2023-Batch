public class complexnumber {
	double real,img;
	
	complexnumber(double r , double i){
	real = r; img=1;}	
	
	public static complexnumber sum(complexnumber c1 , complexnumber c2)
	{
		complexnumber temp=new complexnumber(0,0);
		temp.real = c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	

	public static void main(String[] args) {
		complexnumber c1 = new complexnumber(5.5,4);
		complexnumber c2 = new complexnumber(1.2,3.5);
		complexnumber temp= sum(c1,c2);
		System.out.printf("sum is:"+temp.real + "+" + temp+ "i");
		
	}

}
