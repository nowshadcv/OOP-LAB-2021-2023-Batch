package complex;



public class Complex{

	double real,image;
	Complex (double r,double i){
		real=r;
		image=i;
	}
	public static Complex sum(Complex c1,Complex c2){
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.image=c1.image+c2.image;
		return temp;

	}

	public static void main(String[] args) {

		Complex c1=new Complex(5.5,4);
		Complex c2=new Complex(1.2,3.5);
		Complex temp=sum(c1,c2);
		System.out.printf("Sum is: " + temp.real + "+" + temp.image + "i");
	}

}