import java.util.Scanner;

public class iee754converter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        float decimalNumber = scanner.nextFloat();
        int ieee754Representation = Float.floatToIntBits(decimalNumber);
        System.out.println("IEEE 754 representation: " + Integer.toBinaryString(ieee754Representation));
    }
}