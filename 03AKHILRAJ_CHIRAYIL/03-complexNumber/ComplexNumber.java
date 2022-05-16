
public class ComplexNumber {
	double real, img ;
	ComplexNumber(double r , double i){
		real=r; img=i;
	}
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber (2.2,2.3);
		ComplexNumber c2 = new ComplexNumber (1,1);
		ComplexNumber temp = sum(c1,c2);
		System.out.println("Sum of complex number is "+temp.real+"+i"+temp.img);
		

	}

}

