/*
Create variables: sum of the numbers, count, most recent number

repeat as long as most recent number isn't negative:
  Ask for input
  Get input from the user and save it in variable
  Add most recent number to our sum
  Add 1 to the count

 Print the average (total / count)
*/
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create variables: sum of the
        // numbers, count, most recent number
        double total = 0; // sum of numbers
        int count = 0; // how many numbers entered
        double num = 0; // most recent number entered

        Scanner input = new Scanner(System.in);

        while (num >= 0) {
            // Ask for input
            System.out.print("Enter a number: ");

            // Get input from the user and save it in variable
            num = Double.valueOf(input.nextLine());

            if (num < 0) {
                break;
            }

            // Add most recent number to our sum
            total += num;
            // Add 1 to the count
            count++;
        }
        // Display result
        System.out.println("Average: " + total/count);
    }
}
