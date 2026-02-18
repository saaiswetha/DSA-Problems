// EASY
// https://leetcode.com/problems/richest-customer-wealth/
// max in sum of each row

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1, r = accounts.length;
        for(int i=0; i<r; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum+= accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}
