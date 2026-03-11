// https://leetcode.com/problems/rotate-image/
// MEDIUM

// Rotate matrix by 90 degrees IN PLACE
// transpose in place + reverse each row

class Solution {
    public void rotate(int[][] matrix) {
        
        // 2 steps --> transpose in place + reverse each row

        int n = matrix.length;
        // traverse col wise but starting from row = col
        for(int i=0;i<n;i++){ // fix col
            for(int j=i;j<n;j++){// fix row
                 if(i==j)
                    continue;
                 else{
                    int currEle = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = currEle;
                 }
            }

            // reverse top most row == i
            int left = 0, right = n-1;
            while(left<=right){
                int temp =  matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
