class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0, endRow = m - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;

       
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }

        
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}
