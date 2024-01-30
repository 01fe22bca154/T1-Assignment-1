/**
 * The PrimeNum class takes a range of numbers as input and prints all the prime numbers within that
 * range.
 */
import java.util.Scanner;  
public class PrimeNumbers{
// The `public static void main(String args[])` method is the entry point of the Java program. It is
// the method that gets executed when the program is run.
public static void main(String args[])
{
    int n1;
    int n2;
    boolean flag;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    sc.close();
    // The code block you provided is checking if the lower bound of the range (n1) is less than 2. If
    // it is, it sets n1 to 2. This is because 2 is the smallest prime number, and any number less than
    // 2 cannot be prime.
    
    if (n1 < 2)
        n1 = 2;
    if (n2 < 2)
    {
        System.out.println("No prime numbers in range.");
        return;
    }
    
   // The code block you provided is responsible for finding and printing all the prime numbers within
   // the given range (n1 to n2).
    System.out.println("Result: ");
    for(int i = n1; i <= n2; i++)
    {
        flag = false;
        for(int j = 2; j < i; j++)
        { 
            if(i % j == 0)
            {
                flag = true;
            }
        }
        if(!flag)
            System.out.println(i);
    }
}
}