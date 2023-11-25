import java.io.*;
import java.util.*;
public class st
{
	public static void main(String args[])
	{
		int i,n,c=0,j,temp,k,m,n1;
		Scanner s=new Scanner (System.in);
		int a[]=new int[100];
		int b[]=new int[100];
		System.out.println("enter the size of array:");
		n=s.nextInt();
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
				
			}
		}
		for(i=0;i<n;i++)
		{
			b[c]=a[i];
			c++;
		}	
		System.out.println("after sorting:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);	
		}	
		System.out.println("enter mTH largest position :");
		m=s.nextInt();
		System.out.println("enter nTH min position :");
		n1=s.nextInt();
		System.out.println("sum:"+(a[m-1]+a[n-n1+1]));

		
		
	}
}