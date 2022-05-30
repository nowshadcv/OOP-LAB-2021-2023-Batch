package arithemeticOperationdoubl;
interface AO{
    Public int add();
    Public int mult();
    Public int sub();
    Public double div();
}


package arithemeticOperationdoubl;
class AriOp implements AO{
    public int num1,num2;
    public AriOp (int n1, int n2){
        num1=n1;
        num2=n2;
       Public  int add(){
            return (num1+num2);
        }
       public int mult(){
            return (num1*num2);
        }
        Public int sub(){
            return (num1-num2);
        }
        Public double div(){
            return (num1/num2);
        }
        
    }
}


import arithemeticOperationdoubl.*;
import java.util.Scanner;
class ArithOperstion {
    public static void main(String[] args) {
        int nOne;
        int nTwo;
        System.out.println("Enter first number");
        Scanner s=new Scanner(System.in);
        nOne = s.nextInt();
        System.out.println("Enter second number");
        nTwo = s.nextInt();
        AriOp a= new AriOp(nOne, nTwo);
        System.out.println("Sum is"+ a.add());
        System.out.println("Division is"+ a.div());
        System.out.println("Multiplication is"+ a.mult());
        System.out.println("Division is "+ a.div());
        
    }
}

