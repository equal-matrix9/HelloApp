/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC6 by using the String.join() method to efficiently concatenate
 * multiple command-line arguments with a specified delimiter.
 * If no names are provided, it defaults to "World".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Nafees
 * @version 7.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC7:
 * 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
 * 2. String.join(): Efficiently joining array elements with a delimiter in a single method call
 * 3. Arrays Class: Using Arrays to work with the args array
 * 4. Default Values: Providing a fallback when no arguments are provided
 * 5. Clean Code: Replacing manual loop logic with a built-in Java utility method
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String finalName = "World";

        // Check if names are provided as command-line arguments
        if (args.length > 0) {
            // Use String.join() to concatenate all names with ", " delimiter
            finalName = String.join(", ", args);
        }

        System.out.println("Hello, " + finalName + "!");
    }
}