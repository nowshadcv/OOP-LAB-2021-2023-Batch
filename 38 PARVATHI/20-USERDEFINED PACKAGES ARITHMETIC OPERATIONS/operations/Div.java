package operations;

public class Div implements Division{
	private int num1,num2;
	public Div(int n1,int n2){num1=n1; num2=n2;}
	public int div() {return(num1/num2);}
}
	