/*
FOR EACH loop notes

"for-each" loop iterates / goes through every value in an array or list of values (like args):

    for (type variableName : arrayName) {
        lines of code to run
    }

Goals for this example:
- Create a calculator that allows us to add any number of numerical args (instead of just 2)
- Warn the user for each negative number entered

Original code to add just 2 number together:

    double num1 = Double.valueOf(args[0]);
    double num2 = Double.valueOf(args[1]);

    double sum = num1 + num2;

    System.out.println("The sum is " + sum);

*/
public class AddCalc {
    public static void main(String[] args) {
        // Create a new var called sum, start at 0
        double sum = 0;

        // The code inside the {} will repeat once for each string in args
        // Each string gets stored in the temporary arg variable (name is arbitrary)
        for (String arg : args) {
            // creates a variable currentNumber with the numerical value of arg
            // Variables created inside a loop or conditional can't be accessed outside of it
            double currentNumber = Double.valueOf(arg);

            if (currentNumber < 0) {
                System.out.println("Warning: " + currentNumber + " is negative");
            }

            // Adds the current number to our sum variable
            sum += currentNumber; // Same as: sum = sum + currentNumber;
        }

        System.out.println("Sum: " + sum);
    }
}