public class palindromechecker {
    public static void main(String[] args) {
        String s = "rotor";
        boolean isPalindrome = true;
        int length = s.length() ;
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome = true) {
            System.out.println(s + " is a palindrome.");
        }
        else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}