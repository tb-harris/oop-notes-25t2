// This imports the Random class from the Java API
// (the library of extra functionality available to us
// for our programs)
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // double, int, char, etc are primitive data types- they have just one value
        double distance = 5.2;

        // Classes like Random, String, etc are more complex data types that have multiple
        // internal values and have their own operations/actions
        // We call these complex data types "classes". An instance of a class is an "object"

        // The Random class creates objects that allow us to generate pseudo-random numbers

        // Random rng - Create a new variable called rng with data type Random
        // new Random() - Constructor that creates an object of type Random
        // Random() has an optional parameter (seed) - ie new Random(0) that will cause
        // the random choices to always be the same.
        Random rng = new Random();

        // generate double between 0 and 100
        double percentile = rng.nextDouble(0, 100);
        System.out.println("Random percentile: " + percentile);

        int raffleNumber = rng.nextInt(0, 5000);
        System.out.println("Your raffle entry is number: " + raffleNumber);

        // we can use random numbers in if statements to perform an action based on random
        // chance - here the message has a 1 in 5000 chance of printing.
        if (raffleNumber == 123) {
            System.out.println("You win the raffle!");
        }

        boolean randomAnswer = rng.nextBoolean();
        System.out.println("Random boolean: " + randomAnswer);
        System.out.println("Will it snow today?");

         if (randomAnswer) {
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }


    }
}