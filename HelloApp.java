/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC5 by using the substring method to remove the trailing delimiter
 * from a greeting built from multiple command-line arguments.
 * If no names are provided, it defaults to "World".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Nafees
 * @version 6.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC6:
 * 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
 * 2. Array Iteration: Using enhanced for loop to traverse all arguments
 * 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
 * 4. StringBuilder: Efficiently building a string in a loop without creating multiple immutable string objects
 * 5. Default Values: Providing a fallback when no arguments are provided
 * 6. Substring Method: Removing the trailing delimiter using substring(0, length - 2)
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String finalName = "World";

        // Check if names are provided as command-line arguments
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name);
                nameBuilder.append(", ");
            }

            // Remove trailing ", " using substring method
            finalName = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + finalName + "!");
    }
}