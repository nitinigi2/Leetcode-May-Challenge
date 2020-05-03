// Question link : https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/    
    
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count=0;
        for(char c : S.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }
        for(char c : J.toCharArray()){
            if(map.containsKey(c)) count+=map.get(c);
        }
        return count;
    }
