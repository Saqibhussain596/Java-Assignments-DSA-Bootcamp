public class RichestCoustomerWealth {
    public static void main(String[] args)
    {
        int[][] accounts = {
                {1, 2, 3},
                {4, 2, 5},
                {23, 1, 4}
        };
        int maxWealth = Integer.MIN_VALUE;
        for (int outerCount = 0; outerCount < accounts.length; outerCount++)
        {
            int sum = 0;
            for (int innerCount = 0; innerCount < accounts[outerCount].length; innerCount++)
            {
                sum += accounts[outerCount][innerCount];
            }
            if (maxWealth < sum)
                maxWealth = sum;
        }
        System.out.println(maxWealth);
    }
}
