import java.io.*;
import java.util.*;
public class wordsort
{
public static void main(String args[])
{
int n,i,j;
String temp;
Scanner w=new Scanner(System.in);
System.out.print("enter no of words :");
n=w.nextInt();
String a[]=new String[n];
System.out.print("enter words :");
for(i=0;i<n;i++)
{
a[i]=w.nextLine();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("after sorting :");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}








