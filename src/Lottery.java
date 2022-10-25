public class Lottery {
    private int lotteryNumber;
    private int userValue;
    private int digit1;
    private int digit2;
    private int lottery1;
    private int lottery2;

    public Lottery()
    {
        lotteryNumber = (int)(Math.random() * 100);
        if (lotteryNumber < 10)
        {
            lottery1 = 0;
        }
        else
        {
            lottery1 = lotteryNumber / 10;
            lottery2 = lotteryNumber % 10;
        }
    }

    public int determineWinnings(int userNumber)
    {
        userValue = userNumber;
        digit1 = userNumber / 10;
        digit2 = userNumber % 10;
        if (userNumber == lotteryNumber)
        {
            return 100;
        }
        if (((digit1 == lottery1) || (digit1 == lottery2)) && ((digit2 == lottery1) || (digit2 == lottery2)))
        {
            return 10;
        }
        if (((digit1 == lottery1) || (digit1 == lottery2)) || ((digit2 == lottery1) || (digit2 == lottery2)))
        {
            return 3;
        }
       else
        {
            return 0;
        }
    }

    public int getLotteryNumber()
    {
        return lotteryNumber;
    }
}
