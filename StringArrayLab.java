public class StringArrayLab {
    public static void main(String[] args) {
        //declare and initialize an array named names
        String[] names = {"John Moss", "Mary Johns", "Mark Woods", "Welbeck Sutcliff", "Nancy Brose"};
        System.out.println("Student Name Directory");
        //use for loop and display each name on a separate line
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        System.out.println("Total students: " + names.length);
        System.out.println("First student: " + names[0]);
        System.out.println("Last student: " + names[names.length - 1]);
    }
}
