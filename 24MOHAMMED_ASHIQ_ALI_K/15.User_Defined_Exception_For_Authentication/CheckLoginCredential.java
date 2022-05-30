import java.util.Scanner;

class UserNameException extends Exception{
	public UserNameException(String msg) {
		super(msg);
	}
}
class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}


public class CheckLoginCredential {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username,password;
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
		int length = username.length();
		try {
			if(length < 6)
				throw new UserNameException("user name must be greater than 6 characters...");
			else if(!username.equals("application"))
				throw new UserNameException("userename incorrect....");
			else if(!password.equals("mca"))
				throw new PasswordException("incorrect password....");
			else
				System.out.println("Login Succesfull");
		}
		catch (UserNameException u){
			u.printStackTrace();
		}
		catch (PasswordException p){
			p.printStackTrace();
		}
		finally {
			System.out.println("the finally is always executed");
		}
		

	}

}
