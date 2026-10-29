public class WeeklyTemperatures {
    public static void main(String[] args) {
        //declare and initialize array named temperature
        int[] temperatures = {72, 75, 70, 68, 74, 77, 73};
        //initialize sum to zero
        int sum = 0;
        //use a for loop to display each temperature and calculates the total adn average
        for (int index = 0; index < temperatures.length; index++) {
            System.out.println("Day " + (index + 1) + ":"
                    + temperatures[index] + " Fahrenheit");
            //calculate the sum
            sum = sum + temperatures[index];
        }
        //calculate average
        double average = (double) sum / temperatures.length;
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f", average);
    }
}
