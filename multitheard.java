import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==8)
			{
				sleep(500);
				System.out.println(i);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int j;
		for(j=1;j<=10;j++)
		{
			if(j==8)
			{
				sleep(500);
				System.out.println(j);
			}
		}
	}
}
class C extends Thread
{
	public void run()
	{
		int k;
		for(k=1;k<=10;k++)
		{
			if(k==8)
			{
		  		sleep(500);
				System.out.println(k);
			}
		}
	}
}
public class multitheard
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		C c=new C();
		c.start();
	}
}