//case 2: what happens within the package
//we have accessed the methods of class Access_Specifier within same package.
//private method we can't able to call

package firstPackage;
public class Access_Speicifiers1 
{
	public void add1()
	{
		
	}
	private void sub1()
	{
		
	}
	void div1()
	{
		
	}
	protected void mul1()
	{
		
	}
	
	public static void main(String[] args) 
	{
		Access_Specifier a1=new Access_Specifier();
		
		a1.add();
		a1.div();
		a1.mul();
	}
}
