import java.util.Scanner;
public class PrimeChecker{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int count = 0;
        if(num>1)
        {
            for(int i=1; i<=num; i++)
            {
                if(num%i==0)
                {
                   count++;
                }
            }
            if(count==2){
                System.out.println("Number is Prime.");

            }
            if(count>2)
            {
                System.out.println("Number not prime.");
                
            }
        }
    }

}