class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(target == matrix[i][j])
                found = true;
            }
        }
        return found;
    }
}