import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter your string : ");
        str = input.next();
        int len = str.length()-1;
        for (int count = 0; count < len; count++)
        {
            if (str.trim().charAt(count) != str.trim().charAt(len))
            {System.out.println(str + " is not a palindrome");
                    return;}
            len--;
        }
        System.out.println(str + " is a palindrome.");
    }
}
