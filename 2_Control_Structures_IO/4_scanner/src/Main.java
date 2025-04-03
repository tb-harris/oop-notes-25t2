// Gives us access to the Java Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creates a new object of type Scanner
        // Calls the constructor of Scanner (object "factory") with
        // an argument indicating the input source
        Scanner input = new Scanner(System.in);

        System.out.println("This is the voting checker! It will tell you if you're eligible to vote in NY");

        System.out.print("Enter your age: ");
        int age = Integer.valueOf(input.nextLine());

       System.out.println("Enter your residency ('c' for citizen, 'r' for resident, 'o' for other)");
       char citizenship = input.nextLine().charAt(0);

        if (age >= 18 && citizenship == 'c') {
            System.out.println("You can vote!");
        } else {
            System.out.println("You aren't eligible");
        }

    }
}