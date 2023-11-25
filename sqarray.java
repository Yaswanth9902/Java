import java.io.*;
import java.util.*;
class sqarray
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int b[]=new int[100],n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements:");
		n=s.nextInt();
		System.out.println("enter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=a[i]*a[i];
		}
 		System.out.println("resulted array :");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
			System.out.print(" "+b[i]);
		}
	}
}