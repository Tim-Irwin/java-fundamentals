import java.util.Scanner;

public class LoanPaymentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        System.out.println("Enter your loan amount: ");
        double loanAmount = input.nextDouble();

        //Calculate payment
        double monthlyInterestRate = interestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * 12 * years;

        System.out.println("The monthly payment is: $" + (int)(monthlyPayment * 100) / 100);
        System.out.println("The total of all payments is: $" + (int)(totalPayment * 100) / 100);
    }
}
