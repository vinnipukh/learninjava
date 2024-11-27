public class baselproblem {
    public static void main(String[] args) {
        double sum = 0.0;
        for(double n = 1.0; n<2000000000; n++){
            sum += 1.0/(n*n);
        }

        System.out.println("Output: "+sum);
        System.out.println("Answer: "+(Math.PI*Math.PI)/6);
    }
}
