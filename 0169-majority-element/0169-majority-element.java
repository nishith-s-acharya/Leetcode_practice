class Solution {
    public int majorityElement(int[] arr) {
      
        int currElement = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                currElement = arr[i];
                count++;
            }
            else if(arr[i]==currElement){
                count++;
            }else{
                count--;
            }
        }
        return currElement;
    }
    
}