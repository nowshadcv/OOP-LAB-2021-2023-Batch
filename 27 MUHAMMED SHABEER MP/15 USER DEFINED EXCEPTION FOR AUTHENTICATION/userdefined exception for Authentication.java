import java.util.Scanner;
class UsernameException extends Exception{
	public UsernameException(String msg){super(msg);}
}
class PassException extends Exception{
	public PassException(String msg){super(msg);}
}

public class CheckLoginCredantal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.print("Enter the user name");
		username=s.nextLine();
		System.out.print("enter the passwrd");
		password=s.nextLine();
		int length=username.length();
		try{
			if(length<6)
				throw new UsernameException("Username must be greater than 6 character");
			else if(!username.equals("application"))
				throw new UsernameException("Username incorrect");
			else if(!password.equals("mca"))
				throw new PassException("Incorrect password ...! type correct password");
			else
				System.out.println("Login successful");
			
				
		}catch (UsernameException u){ u.printStackTrace();}
		catch (PassException p){p.printStackTrace();}
		finally{System.out.println("THe finally is always executed");}

}
}