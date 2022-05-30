
package Exception;

import java.util.Scanner;

class UsernameException extends Exception {
	public UsernameException(String msg) { super(msg); }}

class PasswordException extends Exception {
	public PasswordException(String msg) { super(msg); }}


public class ChekLoginCredential {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String username, password;
		System.out.println( "Enter username:");
		username = s.nextLine();
		System.out.println("enter password:");
		password = s.nextLine();
		int length = username.length();
		try {
			if(length < 6)
				throw new UsernameException("username must be greater than 6 character");
			else if(!username.equals("application"))
				throw new UsernameException("invalid username");
			else if(!password.equals("mca"))
				throw new PasswordException("incorrect password");
			else
				System.out.println("login succsessfull");
		}
		catch (UsernameException u) {u.printStackTrace();}
			catch (PasswordException p) {p.printStackTrace();}
				finally { System.out.println("the finally is always executed..");}}}