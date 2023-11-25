import java.io.*;
import java.util.*;
class comps extends Thread
{
	int n,i,j;
	Scanner s=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter range :");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=2;j<n;j++)
			{
				if(i%j==0)
				{
					if(i!=j)
					System.out.println(" "+i);
					break;
				}
			}
		}	
	}
}
class prime extends Thread
{
	int n,i,j;
	int a[]=new int[100];
	Scanner s=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter range :");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=2;j<n;j++)
			{
				if(i%j==0)
				{
					if(i!=j)
					a[i]=i;
					break;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=i)
			System.out.println("p"+i);
		}	
	}
}
public class thread_primecomps
{
	public static void main(String args[])
	{
		comps c=new comps();
		c.start();
		prime p=new prime();
		p.start();
	}
}







