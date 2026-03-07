// https://leetcode.com/problems/spiral-matrix/description/
// MEDIUM
// Print matrix in a sprial order --> top, right, bot, left & so on...

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, right = matrix[0].length-1, bottom = matrix.length-1,
            left = 0;

        // T 0 R 2 B 2 L 0
        // T 1 R 1 B 1 L 1

        // [[1,2,3,4]]
        // T 0 R 3 B 0 L 0
        // T 1 R 2 B - 1 L 1

        //[[1],[2],[3],[4]]
        // T 0 R 0 B 3 L 0

        List<Integer> ans = new ArrayList<>();
        while(top<=bottom && left<=right){
            // top
            for(int i = left; i<right; i++){
                ans.add(matrix[top][i]);
            }

            //right
            for(int i=top; i<bottom; i++){
                ans.add(matrix[i][right]);
            }

            if(top == bottom){
                ans.add(matrix[top][right]);
                break;
            }
            
            // bottom
            for(int i=right; i>left; i--){
                ans.add(matrix[bottom][i]);
            }

            if(right == left){
                ans.add(matrix[bottom][right]);
                break;
            }

            //left
            for(int i=bottom; i>top; i--){
                ans.add(matrix[i][left]);
            }

            top++;
            right--;
            bottom--;
            left++;
        }

        return ans;
    }
}


// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Example 2:

// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
