package multilevelinheritance;

import java.util.Scanner;

public class InheritancePerson {

	public static void main(String[] args) {
		
		
			
			System.out.println ( " Enter number of teachers : " ) ;
			Scanner sc = new Scanner ( System . in ) ;
			int N = sc . nextInt ( ) ;
			Teacher1 [ ] teacher1s = new Teacher1 [N ] ;
			Scanner scs = new Scanner ( System . in ) ;
			for ( int i = 0 ; i<N; i++ ){
			System.out.println( " Enter name of the teacher : S " ) ;
			String name = scs . nextLine ( ) ;
			System.out.println( " Enter gender of the teacher : S " ) ;
			String gen = scs . nextLine ( ) ;
			System.out.println( " Enter address of the teacher : S " ) ;
			String addr = scs . nextLine ( ) ;
			System.out.println( " Enter age of the teacher : I " ) ;
			int ag = sc . nextInt ( ) ;
			System.out.println( " Enter Empid of the teacher : I " ) ;
			int eid = sc . nextInt ( ) ;
			System.out.println( " Enter Company name : S " ) ;
			String cn = scs . nextLine ( ) ;
			System.out.println( " Enter qualification of the teacher : S ") ;
			String quali = scs . nextLine ( ) ;
			System.out.println( " Enter salary of the teacher : I " ) ;
			int sal = sc . nextInt ( ) ;
			System.out.println( " Enter Teacher id : I " ) ;
			int tid = sc . nextInt ( ) ;
			System.out.println( " Enter Subject of the teacher : S " ) ;
			String sub = scs . nextLine ( ) ;
			System.out.println( " Enter Department of the teacher : S " ) ;
			String dept = scs . nextLine ( ) ;
			Teacher1 t = new Teacher1 ( name , gen , addr , ag , eid , cn ,
			quali , sal ,sub , dept , tid ) ;

			teacher1s [ i ] = t ;}
			for ( Teacher1 t : teacher1s ){
			t . displayTeacher ( ) ;}

		
	}

}
