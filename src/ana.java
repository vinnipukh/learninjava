

public class ana {
    public static void main(String[] args) {
        String s = "1048576";

        int n = 0    ;
        for(int i = 0; i <s.length(); i++){
            n *= 10;
            n += s.charAt(i) - '0';

        }
        System.out.println(n);

    }
}