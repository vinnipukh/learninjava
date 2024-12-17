public class removeDoubledLetters {
    public static String removeDoubledLetters(String str){
       String result = "";
       for(int i = 0; i< str.length();i++){
           char ch = str.charAt(i);
           if(i == 0 || ch != str.charAt(i-1)){
               result += ch;

           }
       }

        return result;
    }

    public static void main(String[] args) {

        String word = "bookkeeper";
        System.out.println(removeDoubledLetters(word));

    }
}
