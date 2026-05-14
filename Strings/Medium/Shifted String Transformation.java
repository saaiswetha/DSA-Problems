// MEDIUM
// https://www.hackerrank.com/contests/learnyard-dsa-2-contest-1/challenges/shifted-string-transformation/problem

// Given two strings A and B consisting of lowercase English letters. 
// Choose any integer K and determine if A can be converted into B by shifting each character to the left by K.

import java.util.*;

public class Main {

    public static boolean solve(String a, String b) {
		int n = a.length(), diff = Integer.MIN_VALUE;
        
        // boolean flag = true;
        for(int i=0;i<n;i++){
            int currDiff = a.charAt(i) - b.charAt(i);
            if(currDiff<0){
                currDiff+=26;
            }
            
            if(diff<0){
                diff = currDiff;
            } else if(diff != currDiff){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        System.out.println(solve(A, B) ? "Yes" : "No");
        scanner.close();
    }
}



// Input Format

// 1st line of input consists of string A.
// 2nd line of input consists of string B.

// Constraints

// 1 <= length of A <= 105
// 1 <= length of B <= 105
// length of A = length of B
// 'a' <= Ai, Bi <= 'z', where Ai, Bi represent characters at ith index of string A and B respectively.

// Output Format

// Print Yes if you can convert A to B. Else print No.

// Sample Input 0

// a
// a
// Sample Output 0
// Yes

// Sample Input 1

// learnyard
// jcyplwypb

// Sample Output 1
// Yes

// Explanation 1

// l shifted to left by 2 is j
// e shifter to left by 2 is c
// a shifter to left by 2 is y
// r shifter to left by 2 is p
// n shifter to left by 2 is l
// y shifter to left by 2 is w
// a shifter to left by 2 is y
// r shifter to left by 2 is p
// d shifter to left by 2 is b

// Sample Input 2

// aa
// bz

// Sample Output 2
// No

// Explanation 2

// There is no such K such that 'aa' can be converted to 'bz'.
