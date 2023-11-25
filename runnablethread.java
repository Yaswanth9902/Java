import java.io.*;
import java.util.*;
class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.print(" "+i);
		}
	}
}
public class runnable_thread
{
	public static void main(String args[])
	{
		A a=new A();
		Thread t =new Thread(a);
		t.start();
	}
}	