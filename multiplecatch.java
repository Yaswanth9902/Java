import java.io.*;
import java.util.*;
public class multiplecatch
{
	public static void main(String args[])
	{
		int a[]={37,3,0,6,97},z;
		try
       		{
			z=(a[0]+a[1])/a[6];
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero is Infinite");
		}
		catch(ArrayIndexOutOfBoundaryException e)
		{
			System.out.println("array out of bound");
		}
	}
}