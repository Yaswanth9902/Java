import java.io.*;
import java.util.*;
public class arrayprime
{
public static void main(String args[])
{
int ar[]=new int[100],i,j,n;
Scanner a=new Scanner(System.in);
System.out.print("enter no of elements in array :");
n=a.nextInt();
System.out.print("enter elements :");
for(i=0;i<n;i++)
{
ar[i]=a.nextInt();
}
for(i=0;i<n;i++)
{
boolean prime=true;
for(j=2;j<ar[i];j++)
{
if(ar[i]%j==0)
{
prime=false;
break;
}
}
if(prime)
System.out.println("prime number :"+ar[i]);
else
System.out.println("composite number :"+ar[i]);
}
}
}








