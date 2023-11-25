import java.util.Scanner;
public class primecomposite
{
public static void main (String[] args)
{
    int[] array = new int [5],f;
    Scanner in = new Scanner (System.in);
    
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<5; i++)
    {
        array[i] = in.nextInt();
    }
    for(int i=0; i<array.length; i++)
	{
        f=1;
        for (int j=2; j<array[i]; j++)
	{
            
            if(array[i]%j==0)
	    {
                f=0;
                break;
            }
        }
        if(f>0)
            System.out.println(array[i] + " are the prime numbers in the array ");
        else
            System.out.println(array[i] + " are the composite numbers in the array ");
   
        }
}
}