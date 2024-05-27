class Solution {
    public static boolean Compare(String s1,String s2,int index){
            int n2=s2.length();
            if (index + n2 > s1.length()) {
            return false;
        }
            for(int i=0;i<n2;i++){
                
                if(s1.charAt(index+i)!=s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    public int strStr(String haystack, String needle) {
        
        int n1=haystack.length();
        for(int i=0;i<n1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(Compare(haystack,needle,i)==true){
                    return i;

                }
            }
        }
        return -1;
        
    }
}