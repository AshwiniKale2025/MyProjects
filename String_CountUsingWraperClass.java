package firstPackage;

import java.util.Arrays;

public class String_CountUsingWraperClass
{
	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_space;
	static int count_of_specialchar;
	public static void main(String[] args) 
{
	
	String input="kv no 2 bengalore";
	char c1[]=input.toCharArray();
	System.out.println(Arrays.toString(c1));

for(int i=0;i<input.length();i++)
{
		boolean b1=Character.isAlphabetic(c1[i]);
		if(b1==true)
		{
			count_of_alphabet++;
		}
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			count_of_numeric++;
		}
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			count_of_space++;
		}
		
		//** there is no any function for special character
		}
System.out.println("The count of alphabet is: "+count_of_alphabet);
System.out.println("The count of numeric is: "+count_of_numeric);
System.out.println("The count of spaces is: "+count_of_space);

count_of_specialchar=input.length()-(count_of_alphabet+count_of_numeric+count_of_space);
//OR count_of_specialchar=c1.length-count_of_alphabet-count_of_numeric-count_of_space;
System.out.println("The count of special characters is: "+count_of_specialchar);

}
}
