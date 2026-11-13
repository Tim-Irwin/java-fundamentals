import java.util.Scanner;

public class SumDigitsOfInterger {
//Will add all digits on an integer an display the results to the user.
    public static void main(String[] args) {
        //Create a Scanner object to ger user input.
        Scanner input = new Scanner(System.in);

        //Display message to collect an integer.
        System.out.print("Please enter a positive interger between 0 and 1000: ");
        int num = input.nextInt();

        //Seperate the digits of the integer.
        int numberPlaceOnes = num % 10;
        int numberPlaceTens = ((num % 100) - numberPlaceOnes) / 10;
        int numberPlaceHundreds = ((num % 1000) - numberPlaceOnes - numberPlaceTens) / 100;
        
        //Calcualte the result.
        int sumOfdigits = numberPlaceOnes + numberPlaceTens + numberPlaceHundreds;

        //Display the sum to the user..
        System.out.print("The sum of digits in " + num + " is " + sumOfdigits);
    }
    
}
