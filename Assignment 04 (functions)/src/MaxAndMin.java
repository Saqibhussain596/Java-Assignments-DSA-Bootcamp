import java.util.Scanner;

public class MaxAndMin {
    //Define two methods to print the maximum and the
    // minimum number respectively among three numbers entered by the user.
    static int Max (int a, int b, int c){
        int temp = Math.max (a, b);
        if (temp > c)
            return temp;
        else
            return c;
    }
    static int Min (int a, int b, int c)
    {
        int temp = Math.min (a, b);
        if (temp < c)
            return temp;
        else
            return c;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        System.out.println("Max number : " + Max(num1, num2, num3) + "\nMin number : " + Min(num1, num2, num3));


    }

}
