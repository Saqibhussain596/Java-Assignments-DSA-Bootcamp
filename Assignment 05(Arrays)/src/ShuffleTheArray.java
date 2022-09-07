import java.util.Arrays;

public class ShuffleTheArray {
   // Q. Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArr = new int[2 * n];
        int count_shuffled;
        for (int count_nums  = 0 ; count_nums < n; count_nums++, count_shuffled++)
        {
            count_shuffled = 2 * count_nums;
            shuffledArr[count_shuffled] = nums[count_nums];
            shuffledArr[count_shuffled + 1] = nums[count_nums + n];
        }
        return shuffledArr;

    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 4, 5 ,3, 19};
        System.out.println(Arrays.toString( shuffle(arr, 3)));
    }
}
