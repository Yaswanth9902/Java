import java.io.*;
import java.util.*;
public class armstrong
{
public static void main(String args[])
{
int num,temp,rem,result=0;
Scanner a=new Scanner(System.in);
System.out.println("enter number to check :");
num=a.nextInt();
temp=num;
while(num!=0)
{
rem=num%10;
result=result+rem*rem*rem;
num=num/10;
}
if(result==temp)
{
System.out.println("armstrong number..");
}
else
{
System.out.println("not a armstrong number..");
}
}
}