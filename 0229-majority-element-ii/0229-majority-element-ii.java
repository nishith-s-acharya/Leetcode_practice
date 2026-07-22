class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                count1++;
                ele1 = nums[i];
               
            }
            else if(count2==0 && nums[i]!=ele1){
                count2++;
                ele2 = nums[i];
            }
            else if(nums[i]==ele1){
                count1++;
            }else if(nums[i]==ele2){
                count2++;
            } 
            else{
                count1--;
                count2--;
            }

            
        }
        count1 = 0;
        count2 = 0;
        for(int num:nums){
            if(num==ele1){
                count1++;
            }
            else if(num ==ele2){
                count2++;
            }
        }

        ArrayList<Integer>list  = new ArrayList<>();
        int n = nums.length;

        if(count1>(n/3)){
            list.add(ele1);
        }
        if(count2>(n/3)){
            list.add(ele2);
        }
        return list;
    }
}