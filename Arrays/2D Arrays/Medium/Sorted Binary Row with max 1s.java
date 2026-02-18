// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
// MEDIUM

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length, m = arr[0].length;
        int r = 0, c = m-1;
        int maxRowId = -1;
        
        for(;r<n && c>=0;){
            if(arr[r][c] == 1){
                c--;
                maxRowId = r;
            } else {
                r++;
            }
        }
        
        return maxRowId;
    }
}
