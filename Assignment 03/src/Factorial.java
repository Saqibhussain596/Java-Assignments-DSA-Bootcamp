import java.util.Scanner;

public class Factorial {
    static int factorial(int num){
        int fact = 1;
        while (num > 0){
            fact *= num;
            num--;
        }
        return  fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        System.out.println("Factorial of " + num + " is : " + factorial(num));
    }
}
