public class overflowchecker {
    public static void main(String[] args) {
        int x = 0,y = 0;
        if (x > 0 && y > 0 && x > Integer.MAX_VALUE - y) {
            System.out.println("this guy is all over the floor mate... ");
        }
        else if (x < 0 && y < 0 && x < Integer.MIN_VALUE - y) {
            System.out.println("this guy is all over the floor mate... ");
        }
        else{
            System.out.println("no problem mate! ");

        }
    }
}
