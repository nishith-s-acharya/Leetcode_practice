class Solution {
    public void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

    }
    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
    }
    public void rotate(int[][] arr) {
        
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr[i].length;j++){
                swap(arr,i,j);
            }
        }

        for(int i =0;i<arr.length;i++){
            reverse(arr[i]);
        }
     
    }
}