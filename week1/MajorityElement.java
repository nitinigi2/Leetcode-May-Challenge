// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i])+1);
            else map.put(nums[i], 1);
        }
        
        for(int x : map.keySet()){
            int val = map.get(x);
            if(val>nums.length/2) return x;
        }
        return -1;
    }
}
