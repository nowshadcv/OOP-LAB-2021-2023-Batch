package figures;

public class Squre implements FigureSq {
	private int side;
	public Squre(int s){
		side = s;
	}
public int perimeter ()
{
	return (4*side);
}
public int area(){
	return(side*side);
}
}
