// MEDIUM
//https://www.hackerrank.com/contests/learnyard-dsa-2-contest-1/challenges/max-sum-of-diagonal/

// Given a N x N matrix A, find out the maximum sum of elements present in a diagonal among all diagonals of the given matrix.
// Matrix may contain negative integer elements as well.

// Note: Diagonals can be from top left to bottom right and also from top right to bottom left.

import java.util.*;

public class Main {

    public static long solve(int[][] a) {
		long max = Long.MIN_VALUE;
        int n = a.length;
        long[] topR = new long[2*n-1];
        long[] bottomT = new long[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                topR[i+j]+=a[i][j];
                bottomT[n-1+(i-j)]+=a[i][j];
            }
        }
        
        for(int i=0;i<2*n-1;i++){
            if(topR[i]>max){
                max = topR[i];
            } 
            if(bottomT[i]>max){
                max = bottomT[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solve(A));
        scanner.close();
    }
}


// Sample Input 0

// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 0

// 15
// Explanation 0

// Sum of all diagonals from top left to bottom right are:

// 3
// 2 + 6 = 8
// 1 + 5 + 9 = 15
// 4 + 8 = 12
// 7
// Sum of all diagonals from top right to bottom left are:

// 1
// 2 + 4 = 6
// 3 + 5 + 7 = 15
// 6 + 8 = 14
// 9
// Among all the diagonals, the diagonal with the maximum sum is either the one with the numbers 1, 5, 9,
// or the one with the numbers 1, 4, 7, both having a total sum of 15.
