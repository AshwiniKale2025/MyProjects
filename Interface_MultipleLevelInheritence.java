/*multiple level inheritece is not possible to acheive in java using the concept of classes but 
it is possible to acheive in java using Interface.  */

package firstPackage;
interface Onee
{
	void add();
}
interface Two
{
	void subtract();
}

public class Interface_MultipleLevelInheritence implements Onee, Two
{
	public static void main(String[] args) 
	{
		Interface_MultipleLevelInheritence a1=new Interface_MultipleLevelInheritence();
		a1.add();
		a1.subtract();
	}
	
	
	

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
	System.out.println("Interface2: Subtraction");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Interface1: Addition");
	}
}
