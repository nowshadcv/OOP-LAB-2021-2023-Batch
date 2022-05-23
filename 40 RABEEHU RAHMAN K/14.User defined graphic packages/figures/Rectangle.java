package figures;

public class Rectangle implements FigureRc {
	private int side1,side2;
	public Rectangle (int l,int w) {
		side1=l;side2=w;}
	public double perimeter() {
		 return 2*(side1+side2);}
	public double area() {
				double s=(side1*side2);
				return s;
	}
}
