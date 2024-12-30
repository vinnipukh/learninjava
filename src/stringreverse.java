// at cs 101 lab week 8 I was tasked with writing a static method that takes a given String and
//returns its reverse
public class stringreverse {
    public static String reverse(String s) {
        String x = "";
        for(int i = s.length()-1; i>= 0; i--){
            x+=s.charAt(i);

        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

}
