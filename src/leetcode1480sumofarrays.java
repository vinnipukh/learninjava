import java.util.Arrays;

public class leetcode1480sumofarrays {
    public static int[] getSum(int[] nums){
      for(int i =1;i<nums.length;i++){
         nums[i]=nums[i-1]+nums[i];

      }
        return nums;

    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println(Arrays.toString(getSum(x)));
    }
}
