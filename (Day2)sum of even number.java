public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through numbers from 1 to 11
        for (int i = 1; i <= 11; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sum += i;  // Add to the sum
            }
        }

        // Print the sum
        System.out.println("The sum of all even numbers up to 11 is: " + sum);
    }
}
