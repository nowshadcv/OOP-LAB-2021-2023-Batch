package figures;

public class Rectangle implements FigureRe{
	private int side1,side2;
	public Rectangle(int l,int b) {side1 = l;side2 = b;}
	public double perimeter() {return 2*(side1+side2);}
	public double area() {return (side1*side2);}
}



