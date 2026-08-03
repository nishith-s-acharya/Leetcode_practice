class Solution {
    public void setZeroes(int[][] matrix) {
        // first i am marking my row and cols idx

        boolean rowFound1 = false;
       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if (j == 0) {
                        rowFound1 = true;
                    } else {

                        matrix[0][j] = 0;
                    }
                }
            }
        }

        // marking the inner idx matrix

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0 ) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
            
        }
        if (rowFound1) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}