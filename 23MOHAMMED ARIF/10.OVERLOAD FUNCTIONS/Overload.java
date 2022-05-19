
public class Overload {
	void area(float x){
		System.out.println("the area of squre is"+Math.pow(x, 2)+"sq units");}
		void area (float x,float y){
			System.out.println("the area of rectangle is"+x*y+"sq units");
		}
		void area(double x){
			double z=3.14*x*x;
			System.out.println("the area of cycle is"+z+"sq units");
		}
	

	
	

	public static void main(String[] args) {
		
	}

}
