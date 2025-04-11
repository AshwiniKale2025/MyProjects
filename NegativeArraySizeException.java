//refer assignment 28
package firstPackage;

public class NegativeArraySizeException 
{
public static void main(String[] args) 
{
	int rollno []=new int [-4];		//given -ve array size
	rollno[0]=78;
	rollno[0]=74;		//value has been updated
	rollno[1]=7;
	rollno[2]=71;
	rollno[3]=6;
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);
	System.out.println(rollno[3]);
}
}
