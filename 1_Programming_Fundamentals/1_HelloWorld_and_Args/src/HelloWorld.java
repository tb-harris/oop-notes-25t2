// Defining a *class* called Main
// The name of the class has to match the name of the file
// To rename class, variable, etc.: right click -> rename
public class HelloWorld {
    // Function and method (sort of) mean the same thing
    // The main() method contains the code we want to run
    // when our program starts
    public static void main(String[] args) {
        // System.out.println() prints a string and adds a new line
        System.out.println("Hello, world!");

        // print() outputs text without a newline
        System.out.print("Line 2");
        System.out.println("Line 3");

        /*
        The args array stores parameters provided by the user
        Example: word1 word2 word3
        args[0] <- word1
        args[1] <- word2
        args[2] <- word3
        ...

        These parameters are strings. We can add (concatenate)
        strings together with the + operator
        ...
         */
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("Hello, " + args[0] + " " + args[1] + "!");
    }
}