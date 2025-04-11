package firstPackage;

import java.util.Scanner;

public class ScannerClassMethods 
{

public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter your name");
	String FirstName=s1.next();
	System.out.println("The Name is: "+FirstName);
	System.out.println("Are you Graduate? (true/false)");
	boolean b1=s1.nextBoolean();
	System.out.println(b1+", you are graduated");
	System.out.println("Enter the value of Byte");
	byte b2=s1.nextByte();
	System.out.println("The Byte value is: "+b2);
	
	s1.close();
}	
}
