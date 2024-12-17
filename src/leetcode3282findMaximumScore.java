import java.util.List;

public class leetcode3282findMaximumScore {
    public static long findMaximumScore(List<Integer> nums) {
        long score = 0,ma = 0;
        for(int a:nums){
            score += ma;
            ma = Math.max(ma,a);
        }
        return score;
    }
}

