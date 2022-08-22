import java.util.Scanner;

public class Simple_Interest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        float p_amt, time, rate, SI;
        System.out.print("Enter Principal, time, rate : ");
        p_amt = input.nextFloat();
        time = input.nextFloat();
        rate = input.nextFloat();
        SI = p_amt * (rate / 100) * time;
        System.out.println("Simple interest = " + SI);
    }
}
