import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

       List<Integer> list= new ArrayList<>();
        // for row 
        int top = 0;
        int bottom  = arr.length-1;

        // for column
        int left = 0;
        int right = arr[0].length-1;

        while(top<=bottom && left<=right)
        {
        for(int i = left;i<=right;i++){
            list.add(arr[top][i]);
        }
        top++;
        for(int i =top;i<=bottom;i++){
            list.add(arr[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(arr[bottom][i]);
        }

        bottom--;
        }
        if(left<=right){

        for(int i=bottom;i>=top;i--){
            list.add(arr[i][left]);
        }
        left++;
        }


        }
        return list;

    }
}