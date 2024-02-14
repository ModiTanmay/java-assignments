package java__practise;

import java.util.Scanner;

public class Scannerclass_test 
{
   public static void main(String[] args) 
  {
	 System.out.println("Sum of three digits");
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter number 1");
	 int a=sc.nextInt();
	 
	 System.out.println("Enter number 2");
	 int b=sc.nextInt();
	 
	 System.out.println("Enter number 3");
	 int c=sc.nextInt();
	 
	 System.out.println("The sum of a,b and c is...");
	 
	 int sum=a+b+c;
	 
	 System.out.println(sum);
}
}
