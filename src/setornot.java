/* at cs 101 lab week 10 i was tasked with: write a static method that takes an int array as an argument,
and reports whether its elements can form a set, or not. This es-
sentially reports whether or not whether the array contains dupli-
cate elements. If the array does not contain duplicate elements, the
method should return true, indicating that it is a set. If the array
does contain duplicate elements, the method should return false,
indicating that is not a set.
 */
import java.util.Arrays;

public class setornot {
    public static void main(String[] args) {
        int[] x = {6, 8, 9, 2, -1, 12, 5, 17, 3, 1, 7, 11};
        int[] y = {6, 8, 9, 2, -1, 12, 5, 17, 9, 1, 7, 11};
// Should print true if implemented correctly.
        System.out.println(isSet(x));
// Should print false if implemented correctly.
        System.out.println(isSet(y));
    }
    public static boolean isSet(int[] a) {
        Arrays.sort(a);
        for(int i=0; i< a.length-1; i++){

            if(a[i] == a[i+1]){
                return false;
            }
            else{

            }



        }
// Return true if there are no duplicate
// elements in the array. Otherwise,
// return false.
        return true;


    }

}
