package exception;
import java.util.Scanner;
class UsernameExeception extends Exception{
	public UsernameExeception(String msg){ 
		super(msg);}
}
class PasswordException extends Exception {
	public PasswordException(String msg) { super(msg);}
}

public class CheckLoginCredential {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username, password;
		System.out.print("Enter username:");
		username = s.nextLine();
		System.out.print("Enter password:");
		password = s.nextLine();
		int length = username.length();
		try{
			if(length < 6)
				throw new UsernameExeception("Username must be greater than 6 characters..!");
			else if (!username.equals("application"))
				throw new UsernameExeception("Username Incorrect..!");
			else if(!password.equals("mca"))
				throw new PasswordException("Incorrect password..! Type correct password.");
			else
				System.out.println("Login Sucessful !!!");
				
		}
		catch (UsernameExeception u){u.printStackTrace();}
			catch (PasswordException p){ p.printStackTrace();}
				finally {System.out.println("The finally is always executed...");}
		 

	}

}
