package firstPackage;

//cunstructor overloading
public class ThisCallingStatement 
{
	ThisCallingStatement()
	{
		this(200);
		System.out.println("1st");
	}
	ThisCallingStatement(int a)
	{
		this(100,200);
		System.out.println("2nd");
	}
	ThisCallingStatement(int a, int b)
	{
		this(300, "Ashwini");
		System.out.println("3rd");
	}
	ThisCallingStatement(int a, String b)
	{
		System.out.println("4th");
	}

	public static void main(String[] args) 
{
	//new ThisCallingStatement(200); 
	new ThisCallingStatement();
}
}

