/*
Write a program to compute the sum of the reciprocals
of the squares of all positive numbers. That is, write a program to
compute:
∑∞
k=1
1
k2
This sum actually converges, and
computing the sum was known as the
Basel problem.
While it is not possible to add the whole infinite series, for the
purposes of this problem we want to get the sum correct to nine
decimal places (after the decimal point)
 */

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
