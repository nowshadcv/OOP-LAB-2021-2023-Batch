import java.util.Scanner;
class UsernameExeption 	extends Exception{
	public UsernameExeption (String msg){
		super (msg);}}
class PasswordException extends Exception{
	public PasswordException (String msg){
		super (msg);}}
public class CheckLoginCredential {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username,password;
		System.out.print("Enter username : ");
		username = s.nextLine();
		System.out.print("Enter password : ");
		password = s.nextLine();
		int length = username.length();
		try {
			if (length < 6)
				throw new UsernameExeption("Username must be greater than 6 charector");
			else if (!username.equals("application"))
				throw new UsernameExeption("Username incorrect ! ");
			else if (!password.equals("mca"))
				throw new PasswordException("Password is incorrect");
			else
				System.out.println("Login Succesful !!");
		}
		catch (UsernameExeption u){u.printStackTrace();	}
		catch (PasswordException p){p.printStackTrace();	}
		finally {
			System.out.println("The finally is executed");}}}