// https://www.geeksforgeeks.org/problems/count-sorted-rows2702/1
// EASY

// Count the no.of rows strictly sorted - either increasing or decreasing
// Strictly sorted - no 2 elements can be equal in the sorted list

class Solution {
    int sortedCount(int n, int m, int mat[][]) {
        // code here
        // 6 , 9-3
        // 15, 18-3
        // 10, 16-4 
        // i 0 d -1
        int count = 0;
        for(int i=0;i<n;i++){ // row
            int inc = -1, dec = -1; boolean isSorted = true;
            for(int j=1;j<m;j++){ //col
                if(mat[i][j-1] > mat[i][j]){
                    dec++;
                } else if(mat[i][j-1] < mat[i][j]){
                    inc++;
                } else{
                    isSorted = false;
                    break;
                }
                
                if(inc>=0 && dec!=-1 || dec>=0 && inc!=-1){
                    isSorted = false;
                    break;
                }
            }
            count += isSorted ? 1 : 0;
        }
        
        return count;
    }

//   Input:
// N=3,M=3
// Mat=[[1,2,3],[6,5,4],[7,9,8]]
// Output:
// 2
// Explanation:
// The first row is sorted in strictly 
// increasing order while the second row 
// is sorted in strictly decreasing order.
// };

// Input:
// N=3,M=3
// Mat=[[1,2,3],[4,5,6],[7,8,9]]
// Output:
// 3
// Explanation:
// All the rows are sorted in strictly 
// increasing order.
