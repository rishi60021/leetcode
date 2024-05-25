class Solution {
    int maxmlen=Integer.MIN_VALUE;
    int start=-1;
    int end=-1;
    public static boolean isPallindrome(String S,int i,int j){
        while(i<j){
            char c1=S.charAt(i);
            char c2=S.charAt(j);
            if(c1!=c2){
                return false;
            }
            i++;j--;
        }
        return true;

    }
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPallindrome(s,i,j)==true){
                    if((j-i+1)>maxmlen){
                        maxmlen=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}