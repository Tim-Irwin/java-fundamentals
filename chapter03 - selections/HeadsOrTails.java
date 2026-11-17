import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Generate a random number between 0 and 1.
        int number = (int)(Math.random() * 2);
        System.out.println(number);

        //Get user guess(heads or tails).
        System.out.print("Guess heads or tails: ");
        String guess = input.next();

        //Determine if the user guessed correctly and display results to user.
        if("heads".equals(guess) && number == 0) {
            System.out.println("You guessed correctly");
        } else if ("tails".equals(guess) && number == 1) {
            System.out.println("You guessed correctly");
        } else {
            System.out.println("You did not gues correctly");
        }       
    }    
}
