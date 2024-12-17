import java.util.Scanner;
public class oroperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit!");

        while(true){

            String response = scanner.next();
            if(response.equals("q")|| response.equals("Q")){
                System.out.println("Quitting game,bye.");
                 break;
            }
            else{
                System.out.println("You still are playing ze game *insert german murmuring*,you know ze rules, press q or Q to quit ze game");
            }

        }



    }
}
// not logical operator reverses a boolean value