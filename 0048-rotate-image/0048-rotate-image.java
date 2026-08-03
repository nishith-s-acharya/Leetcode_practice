class Solution {
    public static void swap(int[][] arr,int a,int b){
        int temp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = temp;
    }
    public static void shift(int[] arr){
        int n = arr.length;
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                if(j!=i){
                    swap(matrix, i, j);
                }
            }
        }

        for(int i =0;i<matrix.length;i++){
            shift(matrix[i]);
        }
    }
    
}