import java.util.Scanner;
public class ArraySearchLab {
    public static void main(String[] args) {
        //declare and initialize string array
        String[] students = {"John Moss", "Mary Johns", "Mark Woods",
                "Welbeck Sutcliff", "Nancy Brose"};
        //create Scanner object
        Scanner input = new Scanner(System.in);
        // Ask user to enter a student's name
        System.out.print("Enter a student's name: ");
        String name = input.nextLine();
        //declare variables for searching
        boolean found = false;
        int position = -1;
        // Search through the array
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println("Student found!");
            System.out.println("Student position: " + (position + 1));
        }
        else {
            System.out.println("Student not found.");
        }
        input.close();
    }
}
