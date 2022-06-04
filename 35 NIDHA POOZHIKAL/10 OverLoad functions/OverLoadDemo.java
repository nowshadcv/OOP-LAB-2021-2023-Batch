public class OverLoadDemo {
	void area(float x)
	{
		System.out.println("the area of square is" + Math.pow(x, 2) + "sq units");
	}
	void area(float x,float y)
	{
		System.out.println("the area of square is" + x*y + "sq units");
	}
	void area(double y)
	{
		System.out.println("the area of circle is" + 3.14*y*y + "sq units");
	}
}
	class OverLoad{
		public static void main(String[] args) {
			OverLoadDemo ob = new OverLoadDemo();
			ob.area(5);
			ob.area(10, 15);
			ob.area(5);

		}
	}
	