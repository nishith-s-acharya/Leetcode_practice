class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        for(int ele:set){
            if(!set.contains(ele-1)){
                int count = 0;
                while(set.contains(ele++)){
                    count++;
                }
                maxCount = Math.max(count,maxCount);
            }
        }

        return maxCount;
    }
}