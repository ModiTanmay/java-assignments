package java__practise;

import java.util.Scanner;

public class scannerclass_ex1 
{
    public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Entre the marks of Maths");
	    int maths=sc.nextInt();
	    
	    System.out.println("Entre the marks of English");
	    int eng=sc.nextInt();
	    
	    System.out.println("Entre the marks of Hindi");
	    int hin=sc.nextInt();
	    
	    System.out.println("Entre the marks of Gujarati");
	    int guj=sc.nextInt();
	    
	    System.out.println("Your total marks are...");
	    
	    int total=maths+eng+hin+guj;
	   
	    System.out.println(total);
	    
	}
}
