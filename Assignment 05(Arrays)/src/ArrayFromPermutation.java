import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args)
    {
        // Scanner in = new Scanner(System.in);
        int[] nums = {1, 2, 5, 0, 3, 4};
        int[] ans = new int[nums.length];
        for (int count = 0; count < nums.length; count++)
        {
            ans[count] = nums[nums[count]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
