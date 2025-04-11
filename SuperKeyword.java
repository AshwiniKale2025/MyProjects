package firstPackage;

class Parent_Class1							//parent class
{
	void login()
	{
		System.out.println("Login with email id..");
	}
}

public class SuperKeyword extends Parent_Class1				//child class
{
	void login()
	{
		super.login();
		System.out.println("Login with mobile number");
	//	super.login();
	}
public static void main(String[] args) 
{
	SuperKeyword s1=new SuperKeyword();
	s1.login();
}	
}
