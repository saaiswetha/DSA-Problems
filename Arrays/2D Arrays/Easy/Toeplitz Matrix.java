//https://leetcode.com/problems/toeplitz-matrix/description/
//EASY

// SOLUTION 1, kinda complex, But beats 100% in Time Complexity
// Traverse in L and go over each diagonal
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // 1 2   00 01
        // 2 1   10 11
        // 1 2   20 21
        // 2 1   30 31

        // 00 01 02 03 04
        // 10 11 12 13 14
        // 20 21 22 23 24

        // traverse in L shape once and cover diagonally
        boolean isToe = true;
        int m = matrix.length, n = matrix[0].length;

        // cover lower triangle wrt primary diag
        int startRow = m-1;
        while(startRow>=0){
            int startCol = 0, ele = matrix[startRow][startCol];
            for(int i=startRow, j=startCol; i<m && j<n;){
                if(matrix[i][j] != ele){
                    isToe = false;
                    break;
                }
                i++;
                j++;
            } 
            startRow--;
        }

        int colStart = 1;
        while(colStart<n && isToe){
            int rowSt = 0, ele = matrix[rowSt][colStart];
            for(int i=rowSt, j=colStart; i<m && j<n;){
                if(matrix[i][j] != ele){
                    isToe = false;
                    break;
                }
                i++;
                j++;
            }
            colStart++;
        }

        return isToe;
    }
}

// SOLUTION 2, simple but beats only 11% in T.C
// comapre each ele to ele at top left

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean isToe = true;

        for(int i=m-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i-1>=0 && j-1>=0){
                    if(matrix[i][j] != matrix[i-1][j-1]){
                        isToe = false;
                        break;
                    }
                }
            }

            if(!isToe)
                break;
        }
        return isToe;
    }
}

// Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
// Output: true
// Explanation:
// In the above grid, the diagonals are:
// "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
// In each diagonal all elements are the same, so the answer is True.

//  Input: matrix = [[1,2],[2,2]]
// Output: false
// Explanation:
// The diagonal "[1, 2]" has different elements.
