// https://neetcode.io/problems/is-anagram/question
// EASY
// anagram is a string that contains the exact same characters as another string, 
// but the order of the characters can be different.

class Solution {
    public boolean isAnagram(String s, String t) {
        //sort and compare each char
        //char freq table
        int n = s.length(), m = t.length();
        if(n!=m){
            return false;
        }
        // freq array for both string
        // incre char freq for s
        // decre char freq for t
        // all freq at end will be 0 if anagram
        int count[] = new int[26]; // O(1) constant space

        for(int i=0;i<n;i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i: count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}

// Example 1:
// Input: s = "racecar", t = "carrace"
// Output: true

// Example 2:
// Input: s = "jar", t = "jam"
// Output: false
