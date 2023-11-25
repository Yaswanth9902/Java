import java.io.*;
import java.util.*;
public class exception
{
	public static void main(String args[])
	{
		int x=5,y=0,z;
		try
		{
			z=x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero is Infinite");
		}
	}
}