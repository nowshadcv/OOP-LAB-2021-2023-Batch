
public class OverLoadDemo {
	void area(float x){
		System.out.println("The area of the squire is "+Math.pow(x, 2)+"sq unit");
	}
	void area(float x , float y){
		System.out.println("The area of the rectangle is "+ x*y +"sq unit");
	}
	void area(double x){
		double z = 3.14*x*x;
		System.out.println("The area of the cirle is "+ z +"sq unit");
	}
}




public class Overload {

	public static void main(String[] args) {
		OverLoadDemo ob = new OverLoadDemo();
		ob.area(5);
		ob.area(11,12);
		ob.area(2.5);
	}

}

