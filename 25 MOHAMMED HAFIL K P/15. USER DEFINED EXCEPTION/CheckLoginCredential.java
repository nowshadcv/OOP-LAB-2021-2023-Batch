package check;
import java.util.Scanner;

class UsernameExeption extends Exception{
	public UsernameExeption (String msg) {
		super(msg);
	}
}

class PasswordExeption extends Exception{
	public PasswordExeption (String msg) {
		super(msg);
	}
}

public class CheckLoginCredential {
    
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String username, password;
		
		System.out.print("Enter user name: ");
		username = s.nextLine();
		System.out.print("Enter password: ");
		password = s.nextLine();
		
		int length = username.length();
		
		try
		{
			if (length < 6)
				throw new UsernameExeption("Username must be greater than 6 charecters..!");
			else if(!username.equals("application"))
				throw new UsernameExeption("Username Incorrect..");
			else if (!password.equals("mca"))
				throw new PasswordExeption("Incorrect password..! Type correct password.");
			else
				System.out.print("Login Successful !!");
		} catch (UsernameExeption u ) {
			u.printStackTrace();
		} catch (PasswordExeption p ) {
			p.printStackTrace();
		} finally {
			System.out.println("The finally is always executed..");
		}

	}
}