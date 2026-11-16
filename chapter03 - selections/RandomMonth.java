public class RandomMonth {
    //Generates a random number between 1 and twelve, then displays corresponding English month.

    public static void main(String[] args) {
         int numMonth = 1 + (int)(Math.random() * 12);
        System.out.println(numMonth);
         String month = null;

         switch(numMonth) {
            case 1: 
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("The number month does not corespond to any of the twelve month of the year.");
         }
         System.out.println(month);
    }
   
}
