//if else block
package firstPackage;

import java.util.Scanner;

public class ConditionalStatements2 
{
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age");
		int ageofperson=s1.nextInt();
		//int age=20;
		if(ageofperson>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to Vote");
		}
	s1.close();
	}
}
;