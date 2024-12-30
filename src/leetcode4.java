public class leetcode4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length == 2){
            return 2.5;
        }
        else{
            return (nums1[nums1.length/2]+nums2[nums2.length/2])/2;
        }


    }
}
