import java.util.Scanner;

public class Factorial{
    public static long factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        long result = factorial(number);
        scan.close();
        System.out.println("The factorial of " + number + " is " + result);

    }  
}