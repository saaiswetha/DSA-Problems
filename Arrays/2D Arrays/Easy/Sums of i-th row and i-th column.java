// https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1
// EASY

class Solution {
    int sumOfRowCol(int r, int c, int arr[][]) {
        // code here
        int n = Math.min(r,c);
        
        for(int i=0;i<n;i++){
            int sumR = 0, sumC = 0;            
            // row wise sum
            for(int j=0;j<c;j++){
                sumR += arr[i][j];
            }            
            // col wise sum
            for(int j=0;j<r;j++){
                sumC += arr[j][i];
            }            
            if(sumR != sumC)
                return 0;
        }
        
        return 1;        
    }
}
