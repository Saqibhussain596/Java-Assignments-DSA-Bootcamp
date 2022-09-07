import java.util.Arrays;

public class goodPairs {
    public static void main(String[] args)
    {
        ;int[] nums = {1, 2, 3, 1, 1, 4, 5};
        int numOfPairs = 0;
        for (int outer_count = 0; outer_count < nums.length - 1; outer_count++)
        {
            for (int inner_count = outer_count + 1; inner_count < nums.length; inner_count++)
            {
                if (nums[outer_count] == nums[inner_count])
                    numOfPairs++;
            }
        }
        System.out.println(numOfPairs);
    }
}
