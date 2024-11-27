public class KahanSummationExample {
    public static void main(String[] args) {
        double sum = 0.0;
        double c = 0.0; // A small compensation term for lost low-order bits

        double[] numbers = {1.0, 1e-10, 1e-10, -1.0, 1e-10}; // Example data

        for (double num : numbers) {
            double y = num - c;      // Correct the term by subtracting `c`
            double t = sum + y;      // Add the corrected term to the sum
            c = (t - sum) - y;       // Update `c` to capture the rounding error
            sum = t;                 // Update sum with the corrected addition
        }

        System.out.println("Accurate Sum: " + sum);
    }
}
