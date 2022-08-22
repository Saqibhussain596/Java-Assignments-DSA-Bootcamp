import java.util.Scanner;

public class greeting {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String name;
        System.out.print ("Enter your name : ");
        name = input.nextLine();
        System.out.println ("Greetings " + name + "! Welcome to Mars.");


    }

}
