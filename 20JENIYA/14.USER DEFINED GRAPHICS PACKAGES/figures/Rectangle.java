package figures;

public class Rectangle implements FigureRect{
	private double len, breadth;
	public Rectangle(double l,double b) {
		len=l;
		breadth=b;
		
	}
public double perimeter()
{
	return (2*len+breadth);
}
public double area()
{
	return (len*breadth);
}
}
