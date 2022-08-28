import java.util.Scanner;

public class GradeChecker {
    //Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered
    static void grade (int num){
        switch ((num - 1) / 10) {
            case 9 -> System.out.println("Grade : AA");
            case 8 -> System.out.println("Grade : AB");
            case 7 -> System.out.println("Grade : BB");
            case 6 -> System.out.println("Grade : BC");
            case 5 -> System.out.println("Grade : CD");
            case 4 -> System.out.println("Grade : DD");
            case 3, 2, 1, 0 -> System.out.println("Grade : Fail");
            default -> System.out.println("Error! Enter marks between 0 - 100");
        }

    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        grade(marks);
    }
}
