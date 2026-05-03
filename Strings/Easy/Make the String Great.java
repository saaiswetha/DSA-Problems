// EASY
// https://leetcode.com/problems/make-the-string-great/

class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int flag = 0;
        while(flag==0 && sb.length() > 0) {
            flag=1;
            for(int i=0;i<sb.length()-1;i++){
                if(Math.abs(sb.charAt(i) - sb.charAt(i+1)) == 32){
                    // System.out.println(sb.length() + " " + s.charAt(i) + " " + s.charAt(i+1) + " " +sb.toString() + " " + i);
                    sb.delete(i,i+2);
                    flag=0;
                    // break;
                }
            }
        }
        return sb.toString();
    }
}

//------------------------------------------------------------------------------------------------
// Very slow - BEats 5.82%

class Solution {
    public String makeGood(String s) {
        String ans=s;
        int flag = 0;
        while(flag==0 && s.length()>1){
            ans="";
            flag=1;
            for(int i=0;i<s.length();i++){
                if(i<(s.length() - 1) &&Math.abs(s.charAt(i) - s.charAt(i+1)) == 32){
                    i+=1;
                    flag=0;
                    
                } else{
                    ans+=s.charAt(i);
                }
            }
            s=ans;
        }
        return ans;
    }
}
