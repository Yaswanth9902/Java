import java.io.*;
import java.util.*;
public class hallopattern
{
public static void main(String args[])
{
int i,j,n;
Scanner h=new Scanner(System.in);
System.out.println("enter no of rows and columns :");
n=h.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0||i==n-1||j==1||j==n-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}







