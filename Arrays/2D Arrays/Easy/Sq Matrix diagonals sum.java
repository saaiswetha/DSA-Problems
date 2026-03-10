// https://leetcode.com/problems/matrix-diagonal-sum/description/
// EASY

// Add sum of both diagonal elements of square matrix
// exclude repeating element @ n=odd no --> n x n matrix


class Solution {
    public int diagonalSum(int[][] mat) {
        // primary diagonal ->   i==j
        // secondary diagonal -> i+j=n-1

        int r = mat.length, sum = 0; // r == c
        for(int i=0;i<r;i++){
            sum+=mat[i][i];
            sum+=mat[i][r-1-i];
        }

        if(r%2==1){ 
            int id = r/2;
            sum-= mat[id][id]; // works for r=1, c=1 matrix too
        }

        return sum;
    }
}

// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.

// Example 2:
// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8

// Example 3:
// Input: mat = [[5]]
// Output: 5
