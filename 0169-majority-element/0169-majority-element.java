class Solution {
    public int majorityElement(int[] nums) {
        int me = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(count==0){
                me = nums[i];
                count++;
            }
            else if(me==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return me;

    }
}