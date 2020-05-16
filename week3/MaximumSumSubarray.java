Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3330/

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        if(A.length == 0) return 0;
        int sum = A[0];
        int maxSoFar = A[0];
        int maxTotal = A[0];
        int minTotal = A[0];
        int minSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            int num = A[i];
            maxSoFar = Math.max(num, maxSoFar + num);
            maxTotal = Math.max(maxSoFar, maxTotal);
            
            minSoFar = Math.min(num, minSoFar + num);
            minTotal = Math.min(minTotal, minSoFar);
            
            sum += num;
        }
        if(sum == minTotal) return maxTotal;
        return Math.max(sum - minTotal, maxTotal);
    }
}
