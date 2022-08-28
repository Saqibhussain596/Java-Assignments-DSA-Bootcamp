import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int count = 1;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        System.out.print("Factors of " + num + " are : ");
        while (count <= num / 2){
            if (num % count == 0)
                System.out.print(count + ", ");
            count++;
        }
        System.out.print(num);
    }
}
