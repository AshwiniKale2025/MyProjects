package firstPackage;

public class Global_Variable 
{
	static int a=100;					//Global Variable
	int b=77;
	static double pi;
	static String name;
	public static void main(String[] args) 
	{
		int c=10;				//Local Variable
		System.out.println(c+a);
		System.out.println(pi);
		System.out.println(name);
		name="Ashwini";
		System.out.println(name);
		
		Global_Variable g1=new Global_Variable ();
		g1.b=789;
		System.out.println(g1.b);
				
	}
}
