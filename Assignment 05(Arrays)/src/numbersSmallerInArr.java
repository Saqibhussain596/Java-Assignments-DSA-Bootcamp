import java.util.Arrays;

public class numbersSmallerInArr {
    // Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 4, 23, 2, 4};

        int[] result = new int[nums.length];
        int res_count;
        for (int outer_count = 0; outer_count < nums.length; outer_count++)
        {
            res_count = 0;
            for (int inner_count = 0; inner_count < nums.length; inner_count++)
            {
                if (nums[outer_count] > nums[inner_count])
                    res_count++;
            }
            result[outer_count] = res_count++;

    }
}
}
