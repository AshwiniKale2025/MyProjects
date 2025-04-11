package firstPackage;

class Parent_Class							//Parent class
{
	void login()
	{
		System.out.println("Login with email id ");
	}
}
public class MethodOverriding_superKeyword extends Parent_Class			//Child class
{
	void login()
	{
	//	super.login();
		System.out.println("Login with mobile number");
		super.login();
	}
public static void main(String[] args) 
{
	MethodOverriding_superKeyword m1=new MethodOverriding_superKeyword();
	m1.login();
	/*in the case of method overriding if we want to call parent class implementation,
	 * which is suppressed or which is overridden. If we want to call it to gather up it with
	 * the child class implementation, that time we can use the super keyword in child class
	 */
}
}
