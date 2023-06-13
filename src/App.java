import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create variables and input stream object
        int radius, angle;
        double area;
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);

        //Prompt user to enter values of variables and getting values
        System.out.print("Enter the radius of circle: ");
        radius = input.nextInt();

        System.out.print("Enter the angle: ");
        angle = input.nextInt();

        //Calculate area of slice of circle
        area = (pi * radius * radius * angle) / 360.0;
        System.out.println("Area of slice of circle: " + area);
    }
}
