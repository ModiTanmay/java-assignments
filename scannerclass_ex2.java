package java__practise;

import java.util.Scanner;

public class scannerclass_ex2 {

	public static void main(String[] args)  
	{
           System.out.println("Student Marksheet");
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter the name of student");
           String sname=sc.nextLine();
           
           System.out.println("Enter the id of student");
           int sid=sc.nextInt();
           
           System.out.println("Enter the marks of Maths");
           int maths=sc.nextInt();
           
           System.out.println("Enter the marks of English");
           int eng=sc.nextInt();
           
           System.out.println("Enter the marks of Hindi");
           int hin =sc.nextInt();
           
           System.out.println("Enter the marks of Gujarati");
           int guj=sc.nextInt();
           
           
           System.out.println("Total marks");
           
           int total=maths+eng+hin+guj;
           
           System.out.println(total);
           
           System.out.println("Percentage of "+sname);
           float per=total*100/400;
           
           System.out.println(per);
	}

}
