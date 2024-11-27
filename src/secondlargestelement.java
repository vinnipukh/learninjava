/* at cs 101 lab week 10 i was tasked with
Write a static method that takes an int array as an argument,
and returns the second largest element as an int. The array itself
must remain unmodified, and use of Arrays.sort() is not allowed.
 */
public class secondlargestelement {
    public static void main(String[] args) {
        int[] x = {6, 8, 9, 2, -1, 12, 5, 17, 3, 1, 7, 11};
        int secondLargest = secondLargestElement(x);

// If done correctly, this should print 12.
        System.out.println("Second largest element is: " + secondLargest);
    }
    public static int secondLargestElement(int[] a) {
        int big = Integer.MIN_VALUE;
        int verybig = big;

        for(int i : a){
            if(i>verybig){
                big = verybig;
                verybig = i;

            }

        }
        return big;
    }
// This must find the second-largest element
// in the array a, and return it.


}