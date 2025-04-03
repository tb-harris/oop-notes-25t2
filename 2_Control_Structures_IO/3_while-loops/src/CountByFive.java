// Program that counts from 5 to 500 by multiples of 5
public class CountByFive {
    public static void main(String[] args) {
        // Create a new variable num and set it equal to 0
        int num = 5;

        // Count the number of iterations of the loop (how many times
        // it repeats)
        int i = 0;

        // Repeat while num <= 500
        while (num <= 500) {
            System.out.print(num + " ");
            if (num % 50 == 0) {
                System.out.println();
            }
            num += 5;
            i++; // means the same thing as i += 1
        }
        // Once our loop is done, the rest of the program runs
        System.out.println("All done! Number counted: " + i);
    }
}