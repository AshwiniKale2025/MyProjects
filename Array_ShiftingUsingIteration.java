package firstPackage;

import java.util.Arrays;

public class Array_ShiftingUsingIteration
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
	array1[0]=75;
	array1[1]=55;
	array1[2]=65;
	array1[3]=45;
			
	int array2[]=new int[4];
	array2[0]=array1[0];
	array2[1]=array1[1];
	array2[2]=array1[2];
	array2[3]=array1[3];
	
	//or
	for(int i=0;i<array1.length;i++)
	{
		array2[i]=array1[i];
	}
	System.out.println("Array 1 is: "+Arrays.toString(array1));
	System.out.println("Array 2 is: "+Arrays.toString(array2));
}
}
