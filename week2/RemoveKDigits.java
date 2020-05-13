// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/
class Solution {
    public boolean check(char x, char y){
        int m = x-'0';
        int n = y-'0';
        return m>n;
    }
    public String removeKdigits(String s, int k) {
        if(s.length()==1) return "0";
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>c && k>0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        /*while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        } */
        StringBuilder string = new StringBuilder("");
            while(!stack.isEmpty()){
                string.append(stack.pop());
                //stack.pop();
            }
        
        string.reverse();
        string.setLength(string.length()-k);
        int i = 0; 
        while (i < string.length() && string.charAt(i) == '0') 
            i++; 
        string.replace(0, i, ""); 
        if(string.length()==0) string.append("0");
            return string.toString();
    }
}
