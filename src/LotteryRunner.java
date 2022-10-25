import java.util.Scanner;
public class LotteryRunner {
    public static void main(String[] args) {

        // Instance Variables
        Scanner s = new Scanner(System.in);
        Lottery lottery = new Lottery();
        int userNumber;
        int winnings;
        int lotteryNumber;

        // User Input
        System.out.print("Enter your lottery pick: ");
        userNumber = s.nextInt();

        if (userNumber < 10)
        {
            System.out.println(" --> 0" + userNumber);
        }
        else
        {
            System.out.println();
        }
        winnings = lottery.determineWinnings(userNumber);
        lotteryNumber = lottery.getLotteryNumber();

        System.out.print("The lottery number is " + lotteryNumber);
        if (lotteryNumber < 10)
        {
            System.out.println(" --> 0" + lotteryNumber);
        }
        else
        {
            System.out.println();
        }

        if (winnings == 100)
        {
            System.out.println("Exact match: You win $100!");
        }
        else if (winnings == 10)
        {
            System.out.println("Match all digits but not in correct order:  You win $10!");
        }
        else if (winnings == 3)
        {
            System.out.println("Match one digit: you win $3!");
        }
        else
        {
            System.out.println("No matching numbers, you win nothing :(");
        }
    }
}
