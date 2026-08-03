class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int county = n/3;

        // using the HashMap solving the problem
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int ele:map.keySet()){
            if(map.get(ele)>county){
                list.add(ele);
            }
        }
        return list;
    }
}