import java.util.Scanner;
import java.lang.Math;
public class Task 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int smallnum=1;
        int bignum=100;
        int maxattempt=3;
        int totscore=0;
        
        
        while(true)
        {
            int random=(int)(Math.random()* bignum);
             int attempt=0;
             int attemptsleft=0;
             int yourscore=0;
             while(attempt<maxattempt)
             {
                attemptsleft=maxattempt-attempt;
                System.out.println("enter a number between 1 to 100 ("+attemptsleft+" attemps left):");
                int num=sc.nextInt();
                if(num==random)
                {
                    System.out.println("Your gusses is correct.Congratulations!");
                    System.out.println("You won in "+attempt+" attempt");
                    yourscore++;
                }
                else if(num<random)
                {
                    System.out.println("The number too low.Guess again");
                }
                else{
                    System.out.println("The is too high.Guess again");
                }
                attempt++;
             }
            if(yourscore==0)
            {
                System.out.println("You ran out of attempts.Correct number is "+random);
            }
            else
            {
                totscore++;
            }
            System.out.println("Do you want to play again?(yes(1)/no(0))");
            int ch=sc.nextInt();
            if(ch==0)
                break;
        }
    System.out.println("Your total score is "+totscore);
    System.out.println("Thanks for playing.....");
        
    }
}