import java.util.Scanner;

public class PalindromNumber {
    //Determines if a three-digit number entered by the user is a palindrome.
    public static void main(String[] args) {
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Prompt user for a three-digit number.
        System.out.println("Enter a three-digit number to determine if it is a palindrome: ");
        int num = input.nextInt();

        //Determine if the number is a palindrome and display result to user.
        int numOnes = num % 10;
        int numHundreds = (num - (num % 100)) / 100;
        
        if(numOnes == numHundreds) {
            System.out.println("The number " + num + " is a palindrome.");
        } else {
            System.out.println("The number " + num + " is not a palindrome.");
        }

    }
}
