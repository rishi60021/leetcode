class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                ans.push(ch);
            }
            else{
                if(ans.isEmpty()){
                    return false;
                }
               if((ans.peek() == '(' && ch == ')') || (ans.peek() == '{' && ch == '}') || (ans.peek() == '[' && ch == ']'))
{
                    ans.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(ans.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}