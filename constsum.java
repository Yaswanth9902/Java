import java.io.*;
import java.util.*;
class sum
{
	float a,b;
	Scanner s=new Scanner(System.in);
	sum()
	{
		System.out.println("2 values :");
		a=s.nextFloat();
		b=s.nextFloat();
		System.out.println("sum of two numbers:"+(a+b));
	}
}
public class const_sum
{
	public static void main(String args[])
	{
		sum m=new sum();
	}
}