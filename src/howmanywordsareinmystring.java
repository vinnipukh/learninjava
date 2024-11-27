public class howmanywordsareinmystring {
    public static void main(String[] args) {
        String s = "        Just                 go         away,                 please!                 ";
        int wordCount = 0;
        boolean inWord = false;
        int length = s.length() ;

        for(int i = 0; i< length; i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                inWord = false;
            }
            else if(!inWord){
                wordCount++;
                inWord = true;
            }
        }

        System.out.println("The following string:");
        System.out.println(s);
        System.out.println("Contains " + wordCount + " words.");
    }
}