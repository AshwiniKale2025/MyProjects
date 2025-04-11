package firstPackage;

public class String_Functions
{
public static void main(String[] args) 
{
	String name="Ashwini";
	boolean b1=name.equalsIgnoreCase("ashwini");
	System.out.println(b1);
	
	String name1="kv no 2";
	String s1=name1.replace('k', 'n');
	System.out.println(s1);
	
	String s2="I have a boy";
	String s3=s2.replace("boy", "girl");
	System.out.println(s3);
	
	String name2="kv no 2";
	String n5=name2.replace("2", "");
	System.out.println(n5);
	
	String n="kv no 2";
	String n4=n.replaceAll("[a-z]", "");
	System.out.println(n4);
	
	String m1="Ashwini Swapnil Kale";
	String answer=m1.replaceAll("[A-Z]", "");
	System.out.println(answer);
	
	String a1="ram's bank balance is 89765 INR";
	String a3= a1.replaceAll("[0-9]", "");
	System.out.println(a3);
	
	
	
	
}
}
