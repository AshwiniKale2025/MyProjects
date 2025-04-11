package firstPackage;

public class Palindrome 
{
public static void main(String[] args) 
{
	String input="radar";
	String input1="MALAYALAM";
	String output="";
	String output1="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1=input.charAt(i);
		output=output+c1;
	}
	System.out.println(output);
	
	boolean b1=input.equals(output);
	if(b1==true)
	{
		System.out.println("It is Palindrome");
	}
	
	
	
	for(int i=input1.length()-1;i>=0;i--)
	{
		char c1=input1.charAt(i);
		output1=output1+c1;
	}
	System.out.println(output1);
	
	boolean b2=input1.equals(output1);
	if(b2==true)
	{
		System.out.println("It is Palindrome");
	}
}
}
