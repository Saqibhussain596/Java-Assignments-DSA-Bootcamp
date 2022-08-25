import java.util.Scanner;

public class SumOfNumbers {
    //Write a program to print the sum of negative numbers, sum of positive
// even numbers and the sum of positive odd numbers from a list of numbers (N) entered
// by the user. The list terminates when the user enters a zero.
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int num = 1, sumOfNeg = 0, sumOf_posEven = 0, sumOf_posOdd = 0;
        System.out.print("Enter your numbers : ");
        while (num != 0)
        {
            num = input.nextInt();
            if (num < 0)
                sumOfNeg += num;
            if ((num % 2 == 0) && num > 0)
                sumOf_posEven += num;
            if ((num % 2 != 0) && num > 0)
                sumOf_posOdd += num;
        }
        System.out.println("Sum of negative numbers is : " + sumOfNeg);
        System.out.println("Sum of positive even numbers is : " + sumOf_posEven);
        System.out.println("Sum of positive odd numbers is : " + sumOf_posOdd);


    }
}
