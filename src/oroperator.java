import java.util.Scanner;
public class oroperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit!");
        String response = scanner.next();

        if(response.equals("q")|| response.equals("Q")){
            System.out.println("Quitting game,bye.");
        }
        else{
            System.out.println("You are still playing ze game *insert german murmuring*");
        }

    }
}
// not logical operator reverses a boolean value