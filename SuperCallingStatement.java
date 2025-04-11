package firstPackage;

class Reporting1
{
	Reporting1(String a)
	{
		super();
		System.out.println("Reporting1");
	}
}
class Screenshot1 extends Reporting1
{
	Screenshot1()
	{
		super("Ashwini"); 
		/*here the super callig statement is used explicitly 
		 * to call/invoke the constructor "Reporting1" because here class Screenshot is
		 * extending the super class Reporting1.	 
		 */
		System.out.println("Screenshot1");
	}
}


public class SuperCallingStatement extends Screenshot1
{
	public static void main(String[] args) 
	{
		new SuperCallingStatement();
	}
}


