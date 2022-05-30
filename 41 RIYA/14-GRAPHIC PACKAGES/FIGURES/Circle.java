package figures;

public class Circle implements FigureCi{
	private double radius;
	public Circle(double r){ radius = r;}
	public double perimeter(){return (2*3.14*radius);}
	public double area(){ return (3.14*radius*radius);}}
