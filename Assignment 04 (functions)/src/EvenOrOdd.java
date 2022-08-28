import java.util.Scanner;

public class EvenOrOdd {
    //Define a program to find out whether a given number is even or odd.
    static String evenOrOdd (int num){
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " is an " + evenOrOdd(num) + " number");
    }
}
