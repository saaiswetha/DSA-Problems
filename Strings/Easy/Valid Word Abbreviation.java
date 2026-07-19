// https://neetcode.io/problems/valid-word-abbreviation/question

// A string can be shortened by replacing any number of non-adjacent, non-empty substrings with their lengths 
//   (without leading zeros).

// For example, the string "implementation" can be abbreviated in several ways, such as:

// "i12n" -> ("i mplementatio n")
// "imp4n5n" -> ("imp leme n tatio n")
// "14" -> ("implementation")
// "implemetation" -> (no substrings replaced)
// Invalid abbreviations include:

// "i57n" -> (i mplem entatio n, adjacent substrings are replaced.)
// "i012n" -> (has leading zeros)
// "i0mplementation" (replaces an empty substring)
// You are given a string named word and an abbreviation named abbr, return true 
//   if abbr correctly abbreviates word, otherwise return false.

// A substring is a contiguous non-empty sequence of characters within a string.

// Example 1:
// Input: word = "apple", abbr = "a3e"
// Output: true

// Example 2:
// Input: word = "international", abbr = "i9l"
// Output: false

// Example 3:
// Input: word = "abbreviation", abbr = "abbreviation"
// Output: true


class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // int n = word.length(), j=0, m=abbr.length();
        // abbr la

        // char --> compare index in word
        // 0 --> false
        // digit --> find complete number & incre word pointer

        int i=0, j=0, n = word.length(), m = abbr.length();

        while(i<n && j<m){
            if(abbr.charAt(j) == '0'){
                return false; 
            } else if(Character.isDigit(abbr.charAt(j))){
                int num = abbr.charAt(j) - '0';
                j++;
                System.out.println(i + "-=" + j + " " + num);
                while(j<m && Character.isDigit(abbr.charAt(j))){
                    num*=10;
                    num+=abbr.charAt(j) - '0';
                    System.out.println(i + "-" + j + " " + num);
                    j++;
                }
                
                System.out.println(i + " " + j + " " + num);
                if(num+i>n || num>n){
                    return false;
                }
                i+=num;
                
                System.out.println(i + " " + j + " " + num);
            } else if(word.charAt(i) != abbr.charAt(j)){
                return false;
            } else {
                i++; j++;
            }
        }

        return i==n && j==m;
    }
}

// Constraints:

// 1 <= word.length <= 100
// word is made up of only lowercase English letters.
// 1 <= abbr.length <= 100
// abbr is made up of lowercase English letters and digits.
// All digit-only substrings of abbr fit in a 32-bit integer.
