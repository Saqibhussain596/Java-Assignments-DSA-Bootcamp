import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base, height;
        System.out.print("Input base and height : ");
        base= input.nextDouble();
        height = input.nextDouble();
        System.out.println("Area of Triangle is : " + 0.5 * base * height);
    }
}
