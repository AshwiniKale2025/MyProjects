package firstPackage;

public class IfElseIf 
{

	public static void main(String[] args) 
	{
	int a=100;
	int b=200;
	int c=300;
	if(a!=b)
	{
		System.out.println("If Block");
	}
	else if(b==c)
	{
		System.out.println("Else If Block");
	}
	else if(a==c)
	{
		System.out.println("Else If Block2");
	}
	else
	{
		System.out.println("Else Block");
	}
	}
}
