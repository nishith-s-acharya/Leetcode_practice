class Solution {

    public void sortColors(int[] nums) {
        int one = 0;
        int zero = 0;
        int two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                one++;
            }
            else if(nums[i]==0){
                zero++;
            }
            else{
                two++;
            }
        }
       int i = 0;
       while(zero-- >0){
        nums[i++] = 0;
       }
       while(one-- >0){
        nums[i++] = 1;
       }
       while(two-- >0){
        nums[i++] = 2;
       }
       for( i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }


    }
}