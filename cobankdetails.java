import java.io.*;
import java.util.*;
class bankingacc
{
int custnum;
float initialamount,withdrawamount,depamount;
String name;
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("Enter customer name :");
name=s.nextLine();
System.out.println("Enter customer number :");
custnum=s.nextInt();
System.out.println("Enter initial amount in bank amount :");
initialamount=s.nextFloat();
}
void deposit()
{
System.out.println("Enter amount to deposit :");
depamount=s.nextFloat();
initialamount+=depamount;
System.out.println("Total amount in your bank a/c after depositing :"+initialamount);
}
void withdraw()
{
System.out.println("Enter amount to withdraw :");
withdrawamount=s.nextFloat();
if(withdrawamount>initialamount)
{
System.out.println("invalid amount..");
}
else if(initialamount>=500)
{
initialamount-=withdrawamount;
}
else
{
System.out.println("check minimum balance..");
}
}
void checkbalance()
{
System.out.println("Total amount left in your bank a/c :"+initialamount);
}
}
public class co_bankdetails
{
public static void main(String args[])
{
bankingacc a=new bankingacc();
a.getdata();
a.deposit();
a.withdraw();
a.checkbalance();
}
}









