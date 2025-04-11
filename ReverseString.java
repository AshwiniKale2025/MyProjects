package firstPackage;

public class ReverseString 
{
public static void main(String[] args) 
{
	String input="radar";
	String output="";
	
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
	
}
}
