import java.util.Arrays;

public class RunnigSumofArray {
    public static void main(String[] args)
    {
        int[] nums = {1, 4, 2, 5, 12};
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        int count = 1;
        while (count < nums.length)
        {
            runningSum[count] = runningSum[count - 1] + nums[count];
            count++;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
