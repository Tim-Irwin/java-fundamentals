import java.util.Scanner;

public class AddittionQuiz {
    public static void main(String[] args) {
        //Scanner object fo ruser input.
        Scanner input = new Scanner(System.in);

        //generate two random numbers less than 100.
        int r1 = (int)(1 + Math.random() * 100);
        int r2 = (int)(1 + Math.random() * 100);

        //Calculate the correct answer.
        if(r1 < r2) {
            int temp = r1;
            r2 = r1;
            r1 = temp;
        }

        int answer = r1 - r2;

        //Prompt user for their guess.

        System.out.println("Subtract " + r1 + " - " + r2);
        int userGuess = input.nextInt();

        //Display results to user.
        if(userGuess == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. You guessed " + userGuess + ". The correct answer is " + answer + ".");
        }
    }
}
