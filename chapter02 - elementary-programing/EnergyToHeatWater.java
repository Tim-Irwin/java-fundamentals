import java.util.Scanner;

public class EnergyToHeatWater {
    //used to calculate the amount of energy needed to heat an amount of water(kg) from an initial temp(C) to another temp(C). 
        
    public static void main(String[] args) {
        //Create Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Prompt user for input and assign input to variables.
        System.out.print("Enter the water weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("Enter the initial temperature of the water in Celsius: ");
        double temp1 = input.nextDouble();

        System.out.println("Enter the final temperature of the water in Celsius: ");
        double temp2 = input.nextDouble();

        //calculate energy needed to heat the water.
        double joules = weight * (temp2 - temp1) * 4184;
        
        //Display results to user.
        System.out.println("The energy needed is " + String.format("%.1f", joules) + " joules.");
    }     
}
