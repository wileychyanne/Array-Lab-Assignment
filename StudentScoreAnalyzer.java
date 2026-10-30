public class StudentScoreAnalyzer {
    public static void main(String[] args) {
        //declare and initialize an integer array named scores
        int[] scores = {88, 64, 91, 73, 59, 80};
        //create a method named countPassing that accepts scores
        int passingStudents = countPassing(scores);
        System.out.println("Passing students: " + passingStudents);
        System.out.println("Total students: " + scores.length);
    }
    //call countPassing and store return value in a variable
    public static int countPassing(int[] scores) {
        int count = 0;
        // Loop through scores
        for (int i = 0; i < scores.length; i++) {
            // Check if score is passing
            if (scores[i] >= 70) {
                count++;
            }
        }
        return count;
    }
}