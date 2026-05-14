// EASY
// https://www.hackerrank.com/contests/learnyard-dsa-2-contest-1/challenges/maximise-array-operations/problem

// Given an integer array of size N. You are allowed to perform the below operation only if all the array elements are even.

// Replace each element X of the array by X/2.
// Print the maximum number of operations you can perform on an array.

import java.util.*;

public class Main {

    public static int solve(int[] a) {
        // 8 12 40
        // 4 6 20
        // 2 3 10
        int count = 0, allEven = 1;
        while(allEven==1){
            for(int i=0;i<a.length;i++){
                if(a[i]%2!=0){
                    allEven=0;
                    break;
                }
                a[i]/=2;
            }
            if(allEven==0)
                break;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(solve(A));
        scanner.close();
    }
}

// Sample Input 0

// 3
// 8 12 40
// Sample Output 0

// 2
// Explanation 0

// Initially, the array is [8, 12, 40]. Since all those integers are even, we can perform the operation.

// After the operation is performed once, the array will become [4, 6, 20]. Since all these elements are again even, we can perform the operation yet another time.

// After the operation is performed twice, the array will become [2, 3, 10]. Now, there is an odd number i.e. 3 in the array, we cannot perform the operation any more.

// Thus, we can perform the operation at most twice.

// Sample Input 1

// 4
// 5 6 8 10
// Sample Output 1

// 0
// Explanation 1

// Since there is an odd number 5 in the array, we cannot perform the operation at all.
