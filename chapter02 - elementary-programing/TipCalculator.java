import java.util.Scanner;

public class TipCalculator {
//Used to calculate gratuity and final bill for user.
    public static void main(String[] args) {
        //create a scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Obtain subtotal and gratuity rate from user.
        System.out.print("Please enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("please enter the percentage rate fro gratuity: ");
        double gratuityRate = input.nextDouble();

        //Calculate the gratuity at 10%.
        double gratuity = subtotal * (gratuityRate / 100);

        //Calculate the total bill.
        double totalBill = subtotal + gratuity;
        
        //Display results to the user.
        System.out.println("Gratuity should be $" + String.format("%.2f", gratuity) + " and the total is " + String.format("%.2f", totalBill));
    }
    
}
