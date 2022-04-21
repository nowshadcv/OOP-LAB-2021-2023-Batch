import java.lang.reflect.Array;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		
       int c,n,search,array[];
       Scanner in =new Scanner(System.in);
       System.out.println("enter the number of elements");
       n = in.nextInt();
       array=new int[n];
       System.out.println("enter those" + n +"elements");
       for(c=0;c<n;c++)
    	   array[c]=in.nextInt();
    		   System.out.println("enter the value you want to find: ");
    		   search=in.nextInt();
    		   for(c=0;c<n;c++)
    			   if(array[c]==search){
    				   System.out.println(search+" is present in the location: "+(c+1));
    				   break;}
    				   if(c==n)
    					   System.out.println(search+"is not present in the array.");}}
    			   
    	   

    	  

    	   
	


