package firstPackage;

class Reporting
{
	Reporting(String a)
	{
		System.out.println("Reporting a");
	}
}
class Screenshot extends Reporting
{
	Screenshot(int a, int b)
	{
		super("Ashwini");
		System.out.println("Screenshot a");
	}
}
public class SuperCallingStatements extends Screenshot
{
	SuperCallingStatements()
	{
		super(10,20);
		System.out.println("SuperCallingStatements a");
	}
public static void main(String[] args) 
{
	new SuperCallingStatements();
}
}
