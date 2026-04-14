// https://leetcode.com/problems/valid-palindrome/description/
// EASY

// A phrase is a palindrome if, 
//   after converting all uppercase letters into lowercase letters 
//   and removing all non-alphanumeric characters, 
//   it reads the same forward and backward. 
//   Alphanumeric characters include letters and numbers.

// SOLN taking more time and from scratch logic to find non alphanumeric and conversion to lower case
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l=0, r=n-1;
        while(l<r){
            char left = s.charAt(l), right = s.charAt(r);
            // skip non alphnumeric
            if(!(left>=97 && left<=122) && !(left>=65 && left<=90) && !(left>=48 && left <= 57)){
                l++;
                continue;
            }
            if(!(right>=97 && right<=122) && !(right>=65 && right<=90) && !(right>=48 && right<=57)){
                r--;
                continue;
            }
            // upper to lower case
            if(left >= 65 && left <=90){
                left += 32;
            } 
            if(right >= 65 && right <=90){
                right += 32;
            }            
            System.out.println(left + " " + right);
            if(left != right) {
                return false;
            } else {
                l++; r--;
            }
        }
        return true;
    }
}

// ------------------------------------------------------------------------------------------

// SOLN that took very less time, using in-built methods
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length(), l = 0, r = n - 1;
        while(l<r){
            // skip non alphanumeric
            char left = s.charAt(l), right = s.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
            } else if(!Character.isLetterOrDigit(right)){
                r--;
            } else { // checking for equality among alphanumeric chars
                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    return false;
                }
                l++; r--;
            }
        }
        return true;
    }
} 

// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
  
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
  
// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome. 

// Constraints:
// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.
