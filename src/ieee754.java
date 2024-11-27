import java.util.Scanner;

public class ieee754 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            float number = scanner.nextFloat();

            // Convert to IEEE 754 binary format
            int bits = Float.floatToIntBits(number);
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(bits));

            // Pad with leading zeros to ensure 32 bits
            while (binary.length() < 32) {
                binary.insert(0, '0');
            }

            // Display the result
            System.out.println("IEEE 754 Single Precision Representation:");
            System.out.println(binary.toString());
            System.out.println("Hexadecimal: 0x" + Integer.toHexString(bits).toUpperCase());

    }

}
