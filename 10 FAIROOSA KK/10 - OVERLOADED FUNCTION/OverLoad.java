class OverLoadDemo1 {
	void area(float x){
		System.out.println("The area of the square is "+Math.pow(x, 2)+"sq units");}
	void area(float x,float y){
		System.out.println("The area of the square is "+x*y+"sq units");}
	void area(double x){
		double z = 3.14*x*x;
		System.out.println("The area of the square is "+z+"sq units");}
}
	
	
	
	
public class OverLoad1 {
	
	

	public static void main(String[] args) {
		OverLoadDemo1 ob = new OverLoadDemo1();
		ob.area(5);
		ob.area(11,12);
		ob.area(2.5);}}
