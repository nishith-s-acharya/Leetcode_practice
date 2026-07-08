class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        for(int ele:nums){
            count=count^ele;
        }
        return count;
    }
}