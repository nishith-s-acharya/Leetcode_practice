class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        
        int maxCount = 1;
        for(int ele:nums){
            set.add(ele);
        }
        for(Integer ele:set){
            if(!set.contains(ele-1)){
                int count = 1;
                int curr = ele;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}