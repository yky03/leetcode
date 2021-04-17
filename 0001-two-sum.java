
# https://leetcode.com/problems/two-sum/submissions/
# 1. two-sum ( easy )

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // 00 01 02 11 12 2
        // target 보다 큰수는 제외
        // i, j 같은경우 실패
        // 0인경우 실패 nums[i] >= target || 
        // -인경우 실패 nums[i] > target || 제거
        
        int[] result = new int[2];
        int numsLength = nums.length;
        
        for (int i=0; i<numsLength; i++) {
            for (int j=0; j<numsLength-1; j++) {
                if(i == j+1) continue;
                if(nums[i] + nums[j+1] == target) {
                    result[0] = i;
                    result[1] = j+1;
                    return result;         
                }
            }
        }
        
        return result;
        
        
    }
}
