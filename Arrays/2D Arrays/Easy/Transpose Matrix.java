// https://leetcode.com/problems/transpose-matrix/
// EASY
// Tranpose matrix - matrix flipped over its diagonal OR rows swapped with cols

class Solution {
    public int[][] transpose(int[][] matrix) {
        
        // 1 2 3
        // 4 5 6
        
        int r = matrix.length, c = matrix[0].length;
        int ans[][] = new int[c][r]; //tranpose mat has r and c swapped

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}


// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]
  
// Example 2:

// Input: matrix = [[1,2,3],[4,5,6]]
// Output: [[1,4],[2,5],[3,6]]
