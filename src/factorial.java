public class factorial {
    public static void main(String[] args) {
        double n = 1;
        double a =0;

        for( int posint = 5; 0<=posint; posint--){
            n += n*posint;
            a = n;
        }
        System.out.println(a);

    }
}
