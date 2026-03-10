// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
// EASY
// Print 1st row left to R, 2nd R to L, 3rd L to R & so on... 
// n x n matrix

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.length; // n x n matrix
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    ans.add(matrix[i][j]);
                } else {
                    ans.add(matrix[i][n-1-j]);
                }
            }
        }
        
        return ans;
    }
}

// Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
// Output: [45, 48, 54, 87, 89, 21, 70, 78, 15] 
// Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15] 

// Input: n = 2, mat[][] = [[1, 2], [3, 4]]
// Output: [1, 2, 4, 3] 
// Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]
