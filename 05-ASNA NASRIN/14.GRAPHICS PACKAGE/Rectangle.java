package Figures;

public class Rectangle implements FigureRe {
	private int length,breadth;
	public Rectangle(int l,int b) {length=l;breadth=b;}
	public double perimeter() {return (2*(length+breadth));}
	public double area() {return (length*breadth);}

}
