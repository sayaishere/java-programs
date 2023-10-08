import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String givenString) {
        // make everything lower case to get the right result
        String givenStringInLowerCase = givenString.toLowerCase();
        // System.out.println("given string in lower case " + givenStringInLowerCase);

        // Reverse the string
        String reversed = new StringBuilder(givenStringInLowerCase).reverse().toString();
        // System.out.println("lower case string in reverse " + reversed);

        // Compare the original string with the reversed string
        return givenStringInLowerCase.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String readString = scan.nextLine();
        scan.close();
        boolean result = isPalindrome(readString);
        if (result == true)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
       
    }
}
