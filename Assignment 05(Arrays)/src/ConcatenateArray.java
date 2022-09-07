import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args)
    {
        int[] nums = {1, 45, 23, 53};
        int[] ans = new int[2 * nums.length];
        int count = 0;
        while (count < nums.length)
        {
            ans[count] = nums[count];
            ans[count + nums.length] = nums[count];
            count++;
        }
        System.out.println(Arrays.toString(ans));
    }
        }
