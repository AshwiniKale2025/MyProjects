//Class 23
package firstPackage;

import java.util.Arrays;

public class Array_ReverseOrderShiftingIMP
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
	array1[0]=75;
	array1[1]=65;
	array1[2]=55;
	array1[3]=45;
	
	int array2[]=new int[4];
	/* Logic:
	array2[0]=array1[3];
	array2[1]=array1[2];
	array2[2]=array1[1];
	array2[3]=array1[0];
	*/
	
	for(int i=0,k=3; i<array1.length;i++,k--)
	{
		array2[i]=array1[k];
	}

	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	

}
}
