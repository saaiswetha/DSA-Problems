// https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1
// MEDIUM

class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length, i=0;
        int res[] = new int[n*n];
        // res[0] = mat[0][0];
        
        int r = 0, c= 0, dir = 0; // dir 1 --> diagonally down
        while(r<n && c<n && i<n*n){
            // System.out.println(r + " " + c + " ");
            res[i++] = mat[r][c];
            
            if(dir==0 && r-1>=0 && c+1<n){
                r--; c++;
            } else if(dir==1 && r+1<n && c-1>=0){
                r++; c--;
            } else {
                if((r==0 || r == n-1) && c+1<n){
                    c++;
                } else if((c==0 || c == n-1) && r+1<n){
                    r++;
                }
                dir = dir == 0 ? 1 : 0;
                // System.out.println(r + " " + c + " " + dir + " "+ i);
            }
        }
        
        return res;
    }
}


// Example 1:

// Input:
// n = 3
// mat[][] = {{1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}}
// Output: {1, 2, 4, 7, 5, 3, 6, 8, 9}
// Explaination:
// Starting from (0, 0): 1,
// Move to the right to (0, 1): 2,
// Move diagonally down to (1, 0): 4,
// Move diagonally down to (2, 0): 7,
// Move diagonally up to (1, 1): 5,
// Move diagonally up to (0, 2): 3,
// Move to the right to (1, 2): 6,
// Move diagonally up to (2, 1): 8,
// Move diagonally up to (2, 2): 9
// There for the output is {1, 2, 4, 7, 5, 3, 6, 8, 9}.


// Example 2:

// Input:
// n = 2
// mat[][] = {{1, 2},
//            {3, 4}}
// Output: {1, 2, 3, 4}
// Explaination:
// Starting from (0, 0): 1,
// Move to the right to (0, 1): 2,
// Move diagonally down to (1, 0): 3,
// Move to the right to (1, 1): 4
// There for the output is {1, 2, 3, 4}.
