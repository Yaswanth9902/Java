import java.io.*;
import java.util.*;
public class fre
{
	public static void main(String args[])
	{
		int i,n,v=0,j,temp,k;
		Scanner s=new Scanner (System.in);
		int a[]=new int[100];
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
				
				if(a[i]==a[j])
				{
					for(k=j;k<n;k++)
					{
					 a[k]=a[k+1];
					}
				n--;
				j--;
				}
				
			}
		}
		System.out.println("non-duplicated array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);	
		}
	}
}