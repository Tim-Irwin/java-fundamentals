import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        //Create a Scanner object for input.
        Scanner input = new Scanner(System.in);

        //Get user input for radius and length.
        System.out.println("This program will compute the volume of a cylinder given the radius and length.");

        System.out.println("Enter the radius for the cylinder: ");
        double radius = input.nextDouble();

        System.out.println("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        //Calculate the area.
        double area = Math.pow(radius, 2) * Math.PI;

        //Calculate volume using area.
        double volume = area * length;

        //Display answer to user.
        System.out.print("The volume of the cylinder is: " + String.format("%.2f", volume));
    }    
}
