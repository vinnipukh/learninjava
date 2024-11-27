public class taylorexponential {
    public static void main(String[] args) {
        double e= 0.0;
        double factorial = 1.0;
        for(int i = 0; i<20; i++){
            if(i > 0){
                factorial *= i;

            }
            e += 1.0/factorial ;

        }
        System.out.println(e);
    }
}
