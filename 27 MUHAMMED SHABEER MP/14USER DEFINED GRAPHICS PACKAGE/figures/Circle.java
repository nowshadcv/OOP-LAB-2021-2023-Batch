package figures;

public class Circle implements FigureCi {
	private double radious;
	public Circle(double r){radious = r;}
	public double perimeter()
	{
		return(2*3.14*radious);
	}
	public double area(){
		return (3.14*radious*radious);
	}

}
