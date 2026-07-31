class Solution {
    public void setZeroes(int[][] arr) {
        

        //first check the element is zeror or not if yes mark it column and row marker to be 0
        boolean colPart = false;
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                   

                   if(j==0){
                    colPart = true;
                   }else{
                    arr[0][j] = 0;
                   }

                }
            }
        }

        // after marking of i and j then check the row+1,col+1
        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[0][j]==0 || arr[i][0]==0){
                    arr[i][j] = 0;
                }
            }
        }

        // check for the column

        if(arr[0][0] == 0){
            for(int i =0;i<arr[0].length;i++){
                arr[0][i] = 0;
            }
        }
        if(colPart){
            for(int i = 0;i<arr.length;i++){
                arr[i][0] = 0;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}