package figures;

public class Rectangle implements FigureRe{
	private double side1,side2;
	public Rectangle(double l,double b){
		side1=l;
		side2=b;
		
	}
	public double perimeter(){
		return 2*(side1+side2);
	}
	public double area(){
		double a=(side1*side2);
		return a;
	}
	

}
