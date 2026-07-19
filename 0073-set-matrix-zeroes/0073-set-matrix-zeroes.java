class Solution {
    public void setZeroes(int[][] arr) {
        int col0 = 1;
        // this is for the rows and column outer
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0)
                {
                    arr[i][0] = 0;

                    if(j!=0){
                        arr[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                   
                   
                }
            }
        }
        // this is for the inner r&c

        for(int i =1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    if(arr[0][j]==0 || arr[i][0]==0){
                        arr[i][j] = 0;
                    }
                }
            }
        }

        // for the last outer loop
        // change the column
        if(arr[0][0] ==0 ){
            for(int j = 0;j<arr[0].length;j++){
                arr[0][j] = 0;
            }
        }
        // change for the row
        if(col0 == 0){
            for(int i = 0;i<arr.length;i++){
                arr[i][0] = 0;
            }
        }


        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



       
    }
}