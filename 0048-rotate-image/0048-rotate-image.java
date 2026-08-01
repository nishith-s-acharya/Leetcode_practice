class Solution {
    public void reverse(int[] arr){
        int n = arr.length;
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }


    public void rotate(int[][] arr) {

        
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr[i].length;j++){
                if(i!=j){
                    swap(arr,i,j);
                }
            }
        }


        for(int i =0;i<arr.length;i++){
            reverse(arr[i]);
        }
    }
}