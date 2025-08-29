
import java.util.Scanner;

public class UniversityRecordSystem {
    public static void printDesign(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }

    public static void menu(Scanner sc) {
        printDesign(60);
        System.out.println("\t\tWelcome To Student Central");
        printDesign(60);
        System.out.println("Your options for this system are listed below");
        System.out.println(
                "\n1> Add new student.\n2> Edit student.\n3> View all students.\n4> Filter by course.\n5> Filter by status.\n6> Highest CWA.\n7> Average CWA for each course.\n8> Credit Analysis.\n9> Exit.");
        int choice = sc.nextInt();
        switch(choice){
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
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }
}