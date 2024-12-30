import java.util.Arrays;

public class secondsmallestelement {
    public static int secondSmallestElement(int[] a){
        int small = Integer.MAX_VALUE;
        int verysmall = small;
        for(int i:a){
            if(i<verysmall){
                small = verysmall;
                verysmall=i;
            }
            else if (i < small && i != verysmall) {
                small = i;
            }

        }
        return small;


    }

    public static void main(String[] args) {
        int[] x = {6, 8, 9, 2, -1, 12, 5, 17, 3, 1, 7, 11};
        int secondSmallest = secondSmallestElement(x);
        Arrays.sort(x);
        System.out.println("Second smallest element is: " + secondSmallest);
        System.out.println(Arrays.toString(x));
    }


}
