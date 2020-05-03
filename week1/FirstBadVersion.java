// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/

public int firstBadVersion(int n) {
    int l = 1;
    int r = n;
    while (l < r) {
        int mid = l + (r - l) / 2;
        if (isBadVersion(mid)) {
            r = mid;
        } else {
            l = mid + 1;
        }
    }
    return l;
}

/*
when finding mid element:
use low + (high-low)/2
instead of (low+high)/2
because (low+high) can overflow 
eg: low=Integer.MAX_VALUE-2 and high=Integer.MAX_VALUE-1
if we try to find mid using: mid=(low+high)/2 this will result in overflow as int limit exceed.
But if i use, mid=low+(high-low)/2 then it will work perfectly
*/
