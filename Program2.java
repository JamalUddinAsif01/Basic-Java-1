
package Program2;
import java.util.Scanner;
public class Program2 {
//Write a Java program that prints all real solutions to the quadratic equation ax2 + bx + c = 0. 
//Assign values in a, b, c and use the quadratic formula. If the discriminate b2
//- 4ac is negative, 
//display a message stating that there are no real solutions?
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        // Get values for  a, b, c
        System.out.println("Enter the coefficients of ax^2 + bx + c = 0:");
        System.out.print("Enter The value of  a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of  c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check real solutions
        if (discriminant >= 0) {
            // Calculate real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            // Display a message for no real solutions
            System.out.println("No real solutions. Discriminant is negative.");
        }

        scanner.close();
    }
}
