import java.util.Scanner;

public class VotingEligibility {
    //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    static String eligibility (int num){
        if (num >= 18)
            return "Eligible to vote";
        else
            return "Not eligible to vote";
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("You are " + eligibility(age));

    }
}
