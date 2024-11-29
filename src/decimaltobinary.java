import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
       int decimalnumber,quotient,i=1,j;
       int binarynumber[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Decimal: ");
        decimalnumber = scan.nextInt();
        quotient = decimalnumber;
        while(quotient != 0){
            binarynumber[i++] = quotient%2;
            quotient = quotient/2;

        }
        System.out.print("Binary Number: "+binarynumber);
        for(j=i;j>0;j--){
            System.out.println(binarynumber[j]);
        }
        System.out.print("\n");



    }
}
