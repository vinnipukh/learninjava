public class scrabblevalues {
    public static String valueForLetter(char c){
        String faceName = switch (c) {
            case 'A','E','I','O','U','L','N','S','T','R' -> "One";
            case 'D','G' -> "Two";
            case 'B','C','M','P' -> "Three";
            case 'F','H','V','W','Y' -> "Four";
            case 'K' -> "Five";
            case 'J','X' -> "Eight";
            case 'Q','Z' -> "Ten";
            case ' ' -> "Zero";
            default -> throw new IllegalArgumentException("Not a valid dice value: " + c);
        };
        return faceName;


    }

    public static void main(String[] args) {
        char letter = ' ';
        System.out.println("The scrabble value for the letter you provided is: "+valueForLetter(letter));


    }
}
