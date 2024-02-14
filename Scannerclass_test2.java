package java__practise;

import java.util.Scanner;

public class Scannerclass_test2 {

	public static void main(String[] args) 
	{
         System.out.println("gpa of the student");
         
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Enter the marks of sub-1");
         int sub1=sc.nextInt();
         
         System.out.println("Enter the marks of sub-2");
         int sub2=sc.nextInt();
         
         System.out.println("Enter the marks of sub-3");
         int sub3=sc.nextInt();
         
         System.out.println("Total marks");
         
         int total=sub1+sub2+sub3;
         
         System.out.println(total);
         
         System.out.println("Percentage of student");
         
         float per=total*100/300;
         
         System.out.println(per);
         
         
         System.out.println("GPA of the student ");
         
         float gpa=per/100*4;
         
         System.out.println(gpa);
         
         
        
	}

}
