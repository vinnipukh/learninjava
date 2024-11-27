import java.util.Scanner;
public class binaryconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer you want to convert into binary: ");
        int integer = scanner.nextInt();
        String binaryvalue = Integer.toBinaryString(integer);
        System.out.println("Here is the binary value mate: "+binaryvalue);

    }
}
