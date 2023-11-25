import java.io.*;
import java.util.*;
class oddeven
{
	int a[]=new int[100],n,i;
	Scanner s= new Scanner(System.in);
	oddeven()
	{
		System.out.print("Enter no of elements :");
		n=s.nextInt();
		System.out.print("Enter elements :");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("even numbers in array:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(+a[i]);
			}
		}
		System.out.println("odd numbers in array:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(+a[i]);
			}
		}
	}
}
public class const_oddeven
{
	public static void main(String args[])
	{
		oddeven o = new oddeven();
		o.display();
		
	}
}

 			













				