// https://leetcode.com/problems/special-positions-in-a-binary-matrix/
// EASY

class Solution {
    public int numSpecial(int[][] mat) {
        // 1 0 0 1  2
        // 0 1 0 0  1
        // 0 0 1 0  1
        
        // 1 1 1 1   

        // 1 0 0 1
        // 0 0 1 1
        // 1 0 0 1
        // 2 0 1

        int m = mat.length, n = mat[0].length;
        int rowS[] = new int[m];
        int colS[] = new int[n];

        for(int i=0;i<m;i++){            
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1){
                    rowS[i]++;
                    colS[j]++;
                }
            }
        }

        int splC = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1)                             
                    if(rowS[i] == 1 && colS[j] == 1)
                        splC++;
            }
        }

        return splC;
    }
}
