import java.util.Scanner;

public class Armstrong {
    static int num_digits(int num){
        int digits = 0;
        if (num == 0)
            return 1;
        while (num != 0)
        {
            num /= 10;
            digits++;
        }
        return digits;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int low, high;
        System.out.print("Enter lower range and higher range : ");
        low = input.nextInt();
        high = input.nextInt();
        int count = 0;
        System.out.print("Armstrong numbers between " + low + " and " + high + " are : ");
        while (low <= high)
        {
            int res = 0;
            count = low;
             while (count != 0)
             {
                res += Math.pow((count % 10), num_digits(low));
                count /= 10;
             }
             if (res == low)
                 System.out.print(res + " ");
             low++;
        }
    }
}
