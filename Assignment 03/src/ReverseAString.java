import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str, temp = "";
        System.out.print("Enter your string : ");
        str = input.next();
        int strlen = str.length() - 1;
        while (strlen >= 0)
        {
            temp += str.charAt(strlen);
            strlen--;
        }
        System.out.println("Reversed string is : " + temp);
    }
}