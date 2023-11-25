import java.io.*;
import java.util.*;
public class halfdiamond
{
public static void main(String args[])
{
int i,j,n;
Scanner h=new Scanner(System.in);
System.out.println("enter no of rows and columns :");
n=h.nextInt();
for(i=n;i>=0;i--)
{
for(j=i;j<n;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
for(i=1;i<n;i++)
{
for(j=i;j<n;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
