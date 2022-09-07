import java.util.ArrayList;
import java.util.Arrays;
// Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
public class TargetArray {
    public static void main(String[] args)
    {
       int[] nums = {1, 2, 3, 4, 0};
       int[] index = {0, 1, 2, 3, 0};
        ArrayList<Integer> target = new ArrayList<>(nums.length);
        int[] arr = new int[nums.length];
        for (int count = 0; count < nums.length; count++)
        {
            target.add(index[count], nums[count]);
        }
        for (int count = 0; count < nums.length; count++)
        { arr[count] = target.get(count);}
        System.out.println(Arrays.toString(arr));
    }
}
