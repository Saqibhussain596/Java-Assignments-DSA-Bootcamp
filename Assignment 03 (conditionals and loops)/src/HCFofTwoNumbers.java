import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, HCF = 0, low;
        System.out.print("Enter two numbers : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 < num2)
            low = num1;
        else
            low = num2;
        for (int count = 1; count <= (low / 2); count++)
        {
            if ((num1 % count == 0) && (num2 % count == 0))
                HCF = count;
        }
        if (num1 % num2 == 0)
            HCF = num2;
        if (num2 % num1 == 0)
            HCF = num1;
        System.out.println("HCF of " + num1 + " and " + num2 + " is : " + HCF);
    }
}
