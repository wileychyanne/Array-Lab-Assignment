public class ScoreClassificationLab {
    public static void main(String[] args) {
        //declare and initialize array
        int[] scores = {45, 72, 90, 58, 83, 35};
        // Declare and initialize counters
        int passCount = 0;
        int failCount = 0;
        //loop through each score
        for (int i = 0; i < scores.length; i++) {
            // Check if score is passing or failing
            if (scores[i] >= 60) {
                System.out.println("Score: " + scores[i] + " - Pass");
                passCount++;
            }
            else {
                System.out.println("Score: " + scores[i] + " - Fail");
                failCount++;
            }
        }
        //display total passing and failing scores
        System.out.println();
        System.out.println("Passing scores: " + passCount);
        System.out.println("Failing scores: " + failCount);
    }
}
