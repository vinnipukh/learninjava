public class patternMatcher {
    public static void main(String[] args) {
        boolean result;
        result = match("QU***", "QUEEN");
        System.out.println(result ? "SUCCESS" : "FAIL");
        result = match("**R", "CAR");
        System.out.println(result ? "SUCCESS" : "FAIL");
        result = match("C*LL", "CELLO" );
        System.out.println(!result ? "SUCCESS" : "FAIL");
        try {
            result = match("---", "BREAK");
            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCCESS");
        }
    }
    public static boolean match(String pattern, String word) {

       if(!checkRules(word) || !checkRules(pattern)){
            throw new IllegalArgumentException("The word or the pattern doesn't meet the requirements.");
        }

        if(pattern.length() != word.length()){
            return false;
        }

        for(int i = 0; i< pattern.length(); i++){
            char p = pattern.charAt(i);
            char w = word.charAt(i);


            if(p != '*' && p != w ){
                return false;
            }

        }
        return true;
        }
    public static boolean checkRules(String s){
        char c = 0 ;
        for(int i = 0 ; i < s.length() ; i++ ){
            c = s.charAt(i);
            if( c >= 'A' && c <= 'Z' || c == '*')
                return true;
            else{
                return false;
            }
        }
       return false;
    }

    }

