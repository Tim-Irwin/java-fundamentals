import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //Create a Scanner object.
        Scanner input = new Scanner(System.in);
        // Get a Celsius degree from user.
        System.out.print("Enter a Celsius temperature: ");
        double celsiusTemp = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsiusTemp + 32;

        System.out.println(celsiusTemp + " Celsius is " + fahrenheit + " Fahrenheit");

    }
    
}
