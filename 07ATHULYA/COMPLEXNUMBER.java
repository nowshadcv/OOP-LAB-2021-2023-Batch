package complexnumber;

public class Complexnumber {
	double real,img;
	Complexnumber(double r,double i){
	real=r;
	img=i;
	}
public static Complexnumber sum(Complexnumber c1,Complexnumber c2){
	Complexnumber temp=new Complexnumber(0,0);
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	return temp;
	}
	public static void main(String[] args) {
		Complexnumber c1=new Complexnumber(5.5,4);
		Complexnumber c2=new Complexnumber(1.2,3.5);
		Complexnumber temp=sum(c1,c2);
		System.out.printf("sum is :"+ temp.real +"+"+ temp.img+"i");

	}

}
