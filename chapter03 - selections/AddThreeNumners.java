import java.util.Scanner;

public class AddThreeNumners {
    public static void main(String[] args) {
        //Generate three random numbers.
        int random1 = (int)(Math.random() * 10);
        int random2 = (int)( Math.random() * 10);
        int random3 = (int)(Math.random() * 10);

        //Store the sum of all three random numbers
        int sum = random1 + random2 + random3;

        //Display the question to the user.
        System.out.print("What is the sum of " + random1 + " + " + random2 + " + " + random3 + ": ");

        //Create Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Get user input.
        int userAnswer = input.nextInt();

        //Determine if the user enter the correct answer and display results.
        if(sum == userAnswer) {
            System.out.println(userAnswer + " is the correct answer.");
        }
        else {
            System.out.println("Incorrect, you guessed " + userAnswer + "." + " The correct answer is " + sum + ".");
        }

    }
}