package Exception1;

import  java.util.Scanner;

class MyException extends Exception{
	public MyException(String str) { System.out.println(str);}}
	

public class SignException {
	public static void main(String[] args) {
			System.out.println("input N:");
			Scanner s = new Scanner(System.in);
			int N = s.nextInt();
			int sum = 0;
			
			for(int i=0; i < N;i++) {
				System.out.println("input number" + (i+1) + ":");
				int num = s.nextInt();
				try {
					if(num < 0) throw new MyException("number is negative..!");
				}catch (MyException m) { System.out.println(m); i--; continue;}
				sum=sum+num;}
System.out.println("Average of Entered Number : "+(double)sum/N);}}
				