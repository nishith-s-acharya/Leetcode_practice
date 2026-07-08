class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      
        int maxCount = 0;
        
        int count = 0;
        for(int ele:nums){
            if(ele==0){
                count = 0;
            }else{
                count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}