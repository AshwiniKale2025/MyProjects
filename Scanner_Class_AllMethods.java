//write a program to declare and initialize each method of scanner class
package firstPackage;

import java.util.Scanner;

public class Scanner_Class_AllMethods 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String FirstName= s1.next();
		System.out.println("Are You Graduate (true/false)?");
		boolean b1=s1.nextBoolean();
		System.out.println("Enter byte value: ");
		byte b2=s1.nextByte();
		System.out.println("Name is: "+FirstName);
		System.out.println("Gratuate: "+b1);
		System.out.println("Byte value: "+b2);
		
		
		s1.close();
	}
}
