package figures;

public class Rectangle implements FigureRect {
	private int len,breadth;
	public Rectangle(int l,int b) {
		len=l;
		breadth=b;
	}
	public int perimeter()
	{
		return (2*len+breadth);
	}
	public double area()
	{
		return (len*breadth);
	}

}
