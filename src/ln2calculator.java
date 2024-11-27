public class ln2calculator {
    public static void main(String[] args) {
        double ln2 = 0;
        double sign = 1.0;
        for(int i =1; i<=1000; i++){
            ln2 += sign/i;
            sign = -sign ;
        }

        System.out.println(ln2+" the value calculated by the program");
        System.out.println(Math.log(2)+"    math module value");
    }
}
