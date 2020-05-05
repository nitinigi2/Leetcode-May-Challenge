// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/

//method 1

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)==1) return i;
        }
        return -1;
    }
}


// method2
class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(arr[c-'a']==1) return i;
        }
        return -1;
    }
}
