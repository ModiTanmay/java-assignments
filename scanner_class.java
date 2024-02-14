package java__practise;

import java.util.Scanner;

public class scanner_class 
{
    public static void main(String[] args) 
    {
	   
	    Scanner sc=new Scanner(System.in);
	    // Here Scanner is the class And Sc is a Object we can take any other
	    //name as a class aspect to keywords
	    System.out.println("Enter number 1");
	    
	    int a=sc.nextInt();//nextInt is the method to take only integer type
	                       //of data from the user
	    
	    System.out.println("Enter number 2");
	     int b=sc.nextInt();
	    
	    int sum=a+b;
	     System.out.println("The sum of this number is...");
	    System.out.println(sum);
	    
	    
	    
	}
}
