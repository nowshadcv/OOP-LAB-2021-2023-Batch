package exception;
import java.util.Scanner;

class UsernameException extends Exception{
	public UsernameException(String msg) { super(msg);}}

class PasswordException extends Exception{
	public PasswordException(String msg) { super(msg);}}


public class CheckLoginCredential {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.print("enter username:");
		username=s.nextLine();
		System.out.print("enter password:");
		password=s.nextLine();
		int length=username.length();
		try {
			if (length< 6)
				throw new UsernameException("username must be greater than 6 charecters");
			else if(!username.equals("application"))
				throw new UsernameException("username incorrect");
			else if(!password.equals("mca"))
				throw new PasswordException("incorrect password..type correct password");
			else
				System.out.println("login successfull");
			}
		catch (UsernameException u) { u.printStackTrace();}
		catch (PasswordException p) { p.printStackTrace();}
		   finally { System.out.println("the finally is always executed");}}}
							
				
		