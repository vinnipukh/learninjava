public class kahansummationalgorithm {
    public static void main(String[] args) {
            double sum = 0.0 ;
            double c = 0.0;
            for(double i = 1; i<=2000000000;i++){
                double  term =  1.0 /(i*i);
                double y = term - c ;
                double t = sum + y;
                c =(t-sum)-y;
                sum=t;

            }
        System.out.println(sum);
        System.out.println(Math.PI*Math.PI/6.0);

    }
}
