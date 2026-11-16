import java.util.Scanner;


public class SolveQuadraticEquations {
    //Displays the results of a quadratic equation.

    public static void main(String[] args){
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //prompt user to enter values for a, b, and c.
        System.out.print("Please enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //determine the value of the discriminant.
        double descriminant = Math.pow(b, 2) - 4 * a * c;
        
        //calculate the roots.
        double r1 = (-b + Math.pow(descriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(descriminant, 0.5)) / (2 * a);
    
        //display the results based on the discriminant/
        if(descriminant > 0) {
            System.out.println("The equation has 2 roots: " + String.format("%.5f" ,r1) + " and " + String.format("%.5f", r2));
        }
        else if(descriminant == 0) {
            System.out.println("The equation has one root: " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }    
}
