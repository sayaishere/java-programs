import java.util.Scanner;

public class Palindrome{
    public static void checkPalindrome(int number)
    {
        int originalNumber = number;
        int reversedNumber = 0;

        while(number>0)
        {
            int lastNumber = number%10;
            reversedNumber = reversedNumber*10+lastNumber;
            number = number/10;


        }
        if(originalNumber == reversedNumber)
        {
            System.out.println(originalNumber + " is a Palindrome.");
        }
        else
        {
            System.out.println(originalNumber + " is not a Palindrome.");
            
        }
    }
    public static void main(String[] args)
    {
 Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        scan.close();
        checkPalindrome(number);
    }
}