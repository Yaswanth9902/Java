import java.io.*;
import java.util.*;
class oddeven implements Runnable
{
	public void run()
	{
		int a[]=new int[100],n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		n=s.nextInt();
		System.out.println("enter elements :");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Even numbers in array:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}     
		System.out.println("Odd numbers in array:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
public class runnable_oddeven
{
	public static void main(String args[])
	{
		oddeven oe=new oddeven();
		Thread t=new Thread(oe);
		t.start();
	}
}






