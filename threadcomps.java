import java.io.*;
import java.util.*;
class prime extends Thread
{
	int n,i,j;
	Scanner s=new Scanner(System.in);
	public void run()
	{
		for(i=1;i<n;i++)
		{
			for(j=2;j<n;j++)
			{
				if(i%j==0)
				{
					System.out.println(" "+i);
				}
			}
		}	
	}
}
public class thread_primecomps
{
	public static void main(String args[])
	{
		prime p=new prime();
		p.start();
	}
}







