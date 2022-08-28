import java.util.Scanner;

public class PrimeNumbers {
    static void isPrime (int num1, int num2)
    {
        int temp = num1;
        for (;temp <= num2; temp++)
        {
            int flag = 1;
            int check = 2;
            while (check * check <= temp)
            {
                if (temp % check == 0)
                {
                    flag = 0;
                    break;
                }
                check++;
            }
            if (flag == 1)
            System.out.print(temp + " ");
        }
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int low, high;
        low = in.nextInt();
        high = in.nextInt();
        System.out.print("Prime numbers between " + low + " and " + high + " are : ");
        isPrime(low , high);

    }
}
