// MEDIUM
// https://www.hackerrank.com/contests/learnyard-dsa-2-contest-1/challenges/a-to-z-string/problem

// Given a string S consisting of uppercase English letters. Print the maximum length of a substring which
// starts with 'A' and ends with 'Z'.

// A substring is a continuous sequence of characters within a string.
// For example, 'low', 'ower' and 'flowe' are substrings of 'flower', whereas 'flw', 'oe' etc. are not.

// Note: It is guaranteed that there always exists at least one substring starting with 
// 'A' and ending with 'Z' in the given string.
  
import java.util.*;

public class Main {

    public static int solve(String S) {
		int firstA = Integer.MAX_VALUE, lastZ = Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'A' && i<firstA){
                firstA = i;
            }
            if(S.charAt(i) == 'Z' && i>lastZ){
                lastZ = i;
            }
        }
        return lastZ - firstA + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        System.out.println(solve(S));
        scanner.close();
    }
}


// Sample Input 0

// QWERTYASDFZXCV
// Sample Output 0

// 5
// Explanation 0

// In the string "QWERTYASDFZXCV" the maximum length of a substring starting with 'A' and
// ending with 'Z' is 5, and the substring is "ASDFZ".
