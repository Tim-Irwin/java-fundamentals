import java.util.Scanner;

public class FindFutureDayOfWeek {
    //Determines what day the week is <number> of days from today.

    public static void main(String[] args){
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //Obtain user input for today and how many days from now.
        System.out.println("Use the corresponding number to enter todays day: ");
        System.out.println("0-Sunday\n1-Monday\n2-Tuseday\n3-Wednesday\n4-Friday\n5-Saturday\n6-Sunday");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysFromToday = input.nextInt();

        
        int dayInFuture = (today + daysFromToday) % 7;


        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("The day of the week you chose as today is " + days[today] + " and " + daysFromToday + " is on a " + days[dayInFuture]);
    }
    
}
