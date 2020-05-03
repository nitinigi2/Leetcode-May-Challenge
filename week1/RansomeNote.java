Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/

// method 1

public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }
        for(char c : ransomNote.toCharArray()){
            if(map.containsKey(c) && map.get(c)>=1){
                int val = map.get(c);
                if(val==1) map.remove(c);
                else map.put(c, map.get(c)-1);
            }
            else return false;
        }
        
        return true;
    }

// method 2

public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c : ransomNote.toCharArray()){
            freq[c-'a']--;
        }
        
        for(char c : magazine.toCharArray()){
            freq[c-'a']++;
        }
        
        for(int x : freq){
            if(x<0) return false;
        }
        return true;
    }

