class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        Arrays.sort(nums);
        int count = 1;
        int current = nums[0];
        for(int i =1;i<nums.length;i++){
            
             if( current == nums[i]){
                count++;
                
            }else{
                if(count>n){
                    list.add(current);
                }
                current = nums[i];
                count = 1;
            }

        }
        if (count > n) {

            list.add(current);

        }
        return list;
    }
}