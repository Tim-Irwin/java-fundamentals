import java.util.Scanner;

public class CheckISBN10 {
    public static void main(String[] args) {
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Prompt user for the first 9 digits of the ISBN.
        System.out.print("Please enter the first 9 digits on the ISBN: ");
        int isbn = input.nextInt();
        
        //extract each digit.
        int d1 = isbn / 100000000;
        int d2 = (isbn / 10000000) % 10;
        int d3 = (isbn / 1000000) % 10;
        int d4 = (isbn / 100000) % 10;
        int d5 = (isbn / 10000) % 10;
        int d6 = (isbn / 1000) % 10;
        int d7 = (isbn / 100) % 10;
        int d8 = (isbn / 10) % 10;
        int d9 = isbn % 10;

        //Calculate d10.
        int lastDigit = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println(lastDigit); 

        if(lastDigit < 10) {
            System.out.println("The ISBN-10 number is " + isbn + lastDigit);
        } else {
            System.out.println("The ISBN-10 number is " + isbn + "X");
        }

    }
    
}
