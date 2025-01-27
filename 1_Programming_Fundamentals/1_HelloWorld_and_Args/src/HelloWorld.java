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
        The args array stores arguments provided by the user.

        Example: word1 word2 word3
        args[0] <- word1
        args[1] <- word2
        args[2] <- word3

        Arguments are an example of *user input* - they allow
        the person running our program to provide new information that
        changes its behavior (without having to edit the code).

        In IntelliJ, you can run a program with arguments by:
        1) With your class file (eg HelloWorld) open, click on the
           ⋮ button (vertical ...) next to the run button at the top right
        2) Click "Run with parameters" or "Edit configuration"
        3) In the "Program Arguments" box, type the arguments separated by spaces
        4) Press "Run", or press "Apply" and then run the program with the green button
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