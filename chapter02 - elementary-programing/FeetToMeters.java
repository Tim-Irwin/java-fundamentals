//Used to convert feet to meters.
import java.util.Scanner;

public class FeetToMeters {

    public static void main(String[] args) {
        //Create a Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Get user input.
        System.out.println("Enter a value in feet to find the value in meters.");
        double feet = input.nextDouble();

        //Calculate meters from feet.
        double meters = feet * 0.305;

        //Display result to user.
        System.out.print(feet + " feet is " + String.format("%.4f", meters) + " meters");
    }
}