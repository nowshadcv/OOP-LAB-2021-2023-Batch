
public class OverloadDemo {
	void area(float x)
	{
		System.out.println("The area of squre is "+Math.pow(x,2)+"sq units");
	}
	void area(float x,float y)
	{
		System.out.println("The area of rectangle is "+x*y+"sq units");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println("The area of circle is "+z+"sq units");
	}
}





