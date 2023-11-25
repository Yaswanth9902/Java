import java.io.*;
import java.util.*;
public class sumeven
{
public static void main(String args[])
{
int n,i=0,even=0;
Scanner s=new Scanner(System.in);
System.out.println("enter range of natural numbers :");
n=s.nextInt();
while(i<=n)
{
if(i%2==0)
{
even=even+i;
}
i=i+1;
}
System.out.println("even sum :"+even);
}}
