class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = (nums.length)/3;
 
        List<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
           map.put(ele,map.getOrDefault(ele,0)+1);

           if(map.get(ele)==len+1){
            list.add(ele);
           }
        }
        return list;
        
    }
}