class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){

        
        // from left to right (row fix column iter)
        for(int j=left;j<=right;j++){
            list.add(matrix[top][j]);
        }
        top++;
        // from (top to bottom (col fix row iter))
        for(int i = top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;

        // from right to left (row fix colmn iter)
        if(top<=bottom){

        for(int j = right;j>=left;j--){
            list.add(matrix[bottom][j]);
        }
        bottom--;
        }
        
        // from bottom to top (col fix row iter)
        if(left<=right){

        for(int i = bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left++;
        }
    }
    return list;
    }

}