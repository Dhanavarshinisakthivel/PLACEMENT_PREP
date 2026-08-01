class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int count=0;
        boolean ans=false;
        for(int i=0;i<s.length();i++){
            ans=false;
            for(;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    ans=true;
                    j++;
                    break;
                }
            }
            if(ans) count+=1;
        }
        if(count==s.length()) return true;
        else return false;
    }
}