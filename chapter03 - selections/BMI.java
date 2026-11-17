import java.util.Scanner;

public class BMI {
    //Detrmines a users BMI using provided height and weight.
    public static void main(String[] args) {
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Obtain the users weight in pounds.
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        //Obtain the users number of feet in thier height.
        System.out.print("Enter how many feet in your height: ");
        double heightFeet = input.nextDouble();

        //Obtain the users remaining number of inches in thier height.
        System.out.print("Enter the remaining number of inches in your hieght: ");
        double heightInches = input.nextDouble();

        //Constants for how many kilograms to wieght and meters to inches.
        final double KILIGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FOOT = METERS_PER_INCH * 12;

        //Calculate BMI
        double weightInKilos = weight * KILIGRAMS_PER_POUND;
        double heightInMeters = (heightFeet * METERS_PER_FOOT) + (heightInches * METERS_PER_INCH);
        double bmi = weightInKilos / Math.pow(heightInMeters, 2);

        //Display result to user.
        System.out.println("Your BMI is " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        } else if(bmi < 25) {
            System.out.println("Normal weight");
        } else if(bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
    
}
