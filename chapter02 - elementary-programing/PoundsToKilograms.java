//Used to convert pounds to kilograms.
import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args) {
        //Create a scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Get user input.
        System.out.print("Enter the value of pounds you would like converted to kilograms: ");
        double pounds = input.nextDouble();

        //Calculate Kilograms from Pounds.
        double kilograms = pounds * 0.454;

        //Display result to the user.
        System.out.println(pounds + " pounds is " + String.format("%.3f", kilograms) + " kilograms");
    }    
}
