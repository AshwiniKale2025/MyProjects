package firstPackage;

import java.util.Arrays;

public class ArrayOutOfBoundsException
{
public static void main(String[] args) 
{

	int rollno []=new int [4];
	rollno[0]=78;
	rollno[0]=74;		//value has been updated
	rollno[1]=7;
	rollno[2]=71;
	rollno[3]=6;
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);
	System.out.println(rollno[3]);
	
	//instead of doing this we can use for loop as below:
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(rollno[i]);
	}
	
	
	//here we will face exception i.e. "ArrayIndexOutOfBoundsException" on line 36
	String name []=new String[3];
	name[0]="ashwini";
	name[1]="swapnil";
	name[2]="kale";
	
//	for(int i=0;i<=3;i++)    //it will throw an exception
	for(int i=0;i<=2;i++)	
	{
		System.out.println(name[i]);
	}
	//here we will face exception i.e. "ArrayIndexOutOfBoundsException" on line 36
	
	//So to resolve this we need to use Arrays.toString function as below
	System.out.println(Arrays.toString(name));
			
	
	
	char gender[]=new char[3];
	gender[0]='F';
	gender[1]='M';
	gender[2]='C';
	
	System.out.println(Arrays.toString(gender));
	
	
}
}
