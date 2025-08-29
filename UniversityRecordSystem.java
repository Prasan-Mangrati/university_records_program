import java.util.*;

public class UniversityRecordSystem {
    // Print Design Prints '#', multiple times as specified in the formal parameter.
    public static void printDesign(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }

    // Simulate clear terminal behaviour just by printing empty lines multiple
    // times.
    public static void clearTerminal() {
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
    }

    // Menu Functionality with Input validation and Error handling.
    public static void menu(Scanner sc) {
        // Run the program until user until user asks to stop.
        boolean errorMessageInvalidInputType = false;
        boolean errorMessageInvalidInput = false;
        while (true) {
            try {
                // Clear terminal simulation by printing empty lines.
                clearTerminal();
                // Print Design Prints '#', multiple times as specified in the actual parameter.
                if (errorMessageInvalidInputType) {
                    System.out.println("Error: !!Invalid Input Type!!\nPlease Enter a Number.");
                    errorMessageInvalidInputType = false;
                }
                if (errorMessageInvalidInput) {
                    System.out.println("Error: !!Input Out of Range!!\nPlease enter the number between 1 - 9 (inclusive).");
                    errorMessageInvalidInput = false;
                }

                printDesign(60);
                System.out.println("\t\tWelcome To Student Central");
                printDesign(60);
                System.out.println("Your options for this system are listed below");
                System.out.println(
                        "\n1> Add new student.\n2> Edit student.\n3> View all students.\n4> Filter by course.\n5> Filter by status.\n6> Highest CWA.\n7> Average CWA for each course.\n8> Credit Analysis.\n9> Exit.\n");
                printDesign(60);
                // Store user input in a variable to handle handle user input.
                int choice = sc.nextInt();

                // Use of Switch over multiple If to make the code more readable and cleaner.
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        System.out.println("Thankyou for Using!. Goodbye!!");
                        // This helps to exit the loop.
                        return;
                    // In case if user input any other value than specified above.
                    default:
                        errorMessageInvalidInput=true;
                }
            } catch (InputMismatchException e) {
                // This runs if the user inputs different datatype like char in input and
                // prevent program from crashing.
                System.out.println("Invalid Input Type.");
                errorMessageInvalidInputType=true;
                sc.nextLine();
            }
        }
    }

    // This method runs first.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }
}