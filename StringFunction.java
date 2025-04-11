package firstPackage;

public class StringFunction
{
public static void main(String[] args) 
{
	String a= "automation";
	int l1=a.length();
	System.out.println(l1);
	
	a.toUpperCase();
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	
	char c1=a.charAt(5);
	System.out.println(c1);
	
	String b= "Testing";
	System.out.println(a.concat(a));
	System.out.println(b.concat(" Engineer"));
	
	String c= " automation testing by mkt ";
	System.out.println(c);
	c.trim();		//trim removes extra spaces before the string starts 
	//and after the string ends but not removes spaces in between the string
	System.out.println(c.trim());
	
	System.out.println(c.isEmpty());
	
	System.out.println(a.substring(2));
	System.out.println(a.substring(2, 5));
			
}
}
