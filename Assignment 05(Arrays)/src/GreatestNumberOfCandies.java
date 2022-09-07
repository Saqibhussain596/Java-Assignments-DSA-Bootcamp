import java.util.ArrayList;
import java.util.Arrays;

public class GreatestNumberOfCandies {
    public static void main(String[] args)
    {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        int size = candies.length;
        ArrayList<Boolean> result = new ArrayList<>(size);
        for (int count_res = 0; count_res < size; count_res++)
        {
            result.add(true);
            for (int count_candies = 0; count_candies < size; count_candies++)
            {
                if (candies[count_res] + extraCandies < candies[count_candies])
                {
                    result.set(count_res, false);
                    break;
                }
            }
        }
        System.out.print(result);

    }
}
