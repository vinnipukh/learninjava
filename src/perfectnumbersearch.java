public class perfectnumbersearch {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            int sum = 0;

            // Find all proper divisors of `number` and sum them
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Check if the sum of proper divisors equals the number
            if (sum == number) {
                System.out.println("Perfect number found: " + number);
            }

            number++; // Move to the next number
        }
    }
}
