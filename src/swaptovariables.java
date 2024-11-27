public class swaptovariables {
    public static void main(String[] args){
        String x = "Water";
        String y = "Nesquik";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x:"+x);
        System.out.println("y:"+y);

    }
}
