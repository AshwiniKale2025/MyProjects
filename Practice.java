package firstPackage;

import java.util.Scanner;

public class Practice 
{

public static void main(String[] args) 
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the name of class: ");
String name=s1.next();
System.out.println("The name is: "+name);
System.out.println("Enter the mentor name: ");
String mentor=s1.next();
System.out.println("The mentor name is: "+mentor);
System.out.println("Enter the batch name: ");
String batch=s1.next();
System.out.println("The batch name is: "+batch);

s1.close();
}	
}
