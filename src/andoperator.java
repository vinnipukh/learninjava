import java.util.Scanner;
public class andoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the temp outside");
        int temp = scanner.nextInt();
        if(temp> 30){
            System.out.println("It is hot out there...");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside.");

        }
        else{
            System.out.println("It's cold out there mate, get your coat on before ya leave.");

        }


    }
}
