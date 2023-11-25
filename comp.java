import java.io.*;
import java.util.*;
public class comp
{
	public static void main(String args[])
	{
		int i,n,v=0,j,temp=0,k=0;
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
			for(j=1;j<n;j++)
			{
				
				if(a[i]%j==0)
				{
					temp++;
				}
				if(temp>2)
				{
					k++;	
					break;	
				}
			}
		temp=0;
		}
		System.out.println("composite no:"+k);
		System.out.println("prime no:"+(n-k));
	}
}