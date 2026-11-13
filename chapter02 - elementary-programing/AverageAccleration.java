import java.util.Scanner;

public class AverageAccleration {
    //Calculates the average acceleration given velocity in meter at two points and time in between.

    public static void main(String[] args) {
        //Create a Scanner object to get user input.
        Scanner input = new Scanner(System.in);

        //Display message to get user input for v0(starting velocity), v1(ending velocity), and time(seconds).
        //Assign user input to variables.
        System.out.print("Please enter your starting velocity(meters/second), ending velocity(meters/second), and time(seconds): ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();

        //Calculate average velocity.
        double avgVelocity = (velocity1 - velocity0) / time;

        //Display results to the user.
        System.out.print("The average acceleration is " + String.format("%.3f", avgVelocity));

    }
    
}
