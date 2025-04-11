package firstPackage;

import java.util.Arrays;

public class ArrayChecking 
{
public static void main(String[] args) 
{
	int no1 []=new int [4];
	no1[0]=78;
	no1[1]=45;
	no1[2]=25;
	no1[3]=98;
	
	
	int no2[]=new int [4];
	no2[0]=78;
	no2[1]=45;
	no2[2]=25;
	no2[3]=98;
	
	boolean b1=Arrays.equals(no1, no2);
	System.out.println(b1);
	
	if(b1==true)
	{
		System.out.println("Arrays are equals to each other");
	}
	else
	{
		System.out.println("Arrays are not equals to each other");
	}
}
}
