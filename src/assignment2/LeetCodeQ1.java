package assignment2;

public class LeetCodeQ1 {


    /**
     * T : O(mn) : the matrix
     * S : O(mn) : the matrix
     */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n =matrix[0].length;
        int num[][]=new int[n][m];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                num[j][i]=matrix[i][j];
            }
        }
        return num;
    }


}
