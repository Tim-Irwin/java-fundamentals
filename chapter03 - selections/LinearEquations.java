import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Get input from user.
        System.out.print("Enter a value for a, b, c, d, e, and f: ");

        //Assign user input to variables.
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        //Calcualte the denominator.
        double denominator = a * d - b * c;

        //Calculate x and y and display the results to the user.
        if(denominator == 0) {
            System.out.println("This equation has no solution.");
        } else {
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }        
    }    
}
