/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC4 by using an enhanced for loop to accept multiple names as 
 * command-line arguments and displaying a personalized greeting. 
 * If no names are provided, it defaults to "World".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Nafees
 * @version 5.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC5:
 * 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
 * 2. Array Iteration: Using enhanced for loop to traverse all arguments
 * 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
 * 4. StringBuilder: Efficiently building a string in a loop without creating multiple immutable string objects
 * 5. Default Values: Providing a fallback when no arguments are provided
 * 6. String Concatenation: Building the final greeting message
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String finalName = "World";

        // Check if names are provided as command-line arguments
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            
            // Enhanced for loop to iterate through the array
            for (String argName : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(argName);
                first = false;
            }
            finalName = nameBuilder.toString(); // Use the constructed string
        }

        System.out.println("Hello, " + finalName + "!");
    }
}