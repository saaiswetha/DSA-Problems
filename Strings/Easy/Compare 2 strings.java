//
// EASY
// compare those two strings lexicographically

// If the first string is less than the second one, print "-1". 
// If the second string is less than the first one, print "1". 
// If the strings are equal, print "0". 
// Note that the letters' case is not taken into consideration when the strings are compared.
// It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s1.length();
        boolean flag = false;
        
        for(int i=0;i<n;i++){
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if((int)c1<=90)
                c1+=32;
            if((int)c2<=90)
                c2+=32;
            if(c1 > c2){
                System.out.println(1);
                flag = true;
                break;
            } else if(c1 < c2) {
                System.out.println(-1);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(0);
    }
}

// Examples
// aaaa
// aaaA
// 0

// abs
// Abz
// -1
  
// abcdefg
// AbCdEfF
// 1
