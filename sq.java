import java.io.*;
import java.util.*;
public class sq
{
	public static void main(String args[])
	{
		int i,n,v=0;
		Scanner s=new Scanner (System.in);
		int a[]=new int[100];
		System.out.println("enter the number:");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(i*i==n)
			{
				System.out.println("sqno:"+i+" -"+i);
				v++;
			}
		}
		if(v==0)
		{
			System.out.println("non-perfect sq number");
		}
	}
}