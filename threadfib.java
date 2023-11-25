import java.io.*;
import java.util.*;
class fib extends Thread
{
	int a=0,b=1,c,n,i;
	Scanner s=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter range:");
		n=s.nextInt();
		System.out.println("Fibonacci series:");
		System.out.print(a);
		System.out.print(" "+b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
public class thread_fib
{
	public static void main(String args[])
	{
		fib f=new fib();
		f.start();
	}
}	