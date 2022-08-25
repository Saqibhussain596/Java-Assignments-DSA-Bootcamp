import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter radius of circle : ");
        radius = input.nextFloat();
        area = (22.0 / 7.0) * radius * radius;
        System.out.println("Area of circle is : " + area);
    }
}
