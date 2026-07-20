import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bottom = arr.length-1;


        while(left<=right && top<=bottom){

        for(int i=left;i<=right;i++){
            result.add(arr[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            result.add(arr[i][right]);
        }
        right--;

        if(top<=bottom){
        for(int i =right;i>=left;i--){
            result.add(arr[bottom][i]);
        }

        bottom--;
        }

        if(left<=right){

        for(int i =bottom;i>=top;i--){
            result.add(arr[i][left]);
        }
        left++;
        }
        
        }
        return result;
    }
}