package package1;
import java.util.Scanner;


@SuppressWarnings("serial")
class UsernameException extends Exception{
	public UsernameException(String msg) { super(msg);}}


@SuppressWarnings("serial")
class passwordException extends Exception{
	public passwordException(String msg) { super(msg);}}


	


public class CheckLoginCredential {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String username,password;
		System.out .print("Enter username:");
		username=s.nextLine();
		System.out.println("Enter password:");
		password=s.nextLine();
		int length= username.length();
		try {
			if(length<6)
				throw new UsernameException("Username must be greater than 6 characters..!");
				else if(!username.equals("application"))
					throw new UsernameException("username incorect");
else if(!password.equals("mca"))
throw new passwordException("Incorrect password..! Type correct password.");
else
	System.out.println("Login successful !!!");
		
		}
		catch (UsernameException u) { u.printStackTrace();}
		catch (passwordException p) {p.printStackTrace();}
		finally {System.out.println("The finally is always executed..");}}
		

	}



 
 
 
 
