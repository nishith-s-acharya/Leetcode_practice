class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int result = 0;
        for(int ele:nums){
            sum+=ele;
        }
        int f_sum = ((n)*(n+1))/2;
        return f_sum-sum;
    }
}