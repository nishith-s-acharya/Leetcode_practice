class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> list = new HashSet<>();
        int i = 0;
        int j = 0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) {
                list.add(nums1[i]);
            }
            if(nums1[i]<=nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[list.size()];
        int a = 0;
        for(Integer ele:list){
            arr[a++] = ele;
        }
        return arr;
    }
}