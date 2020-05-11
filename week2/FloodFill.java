// Question link: https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        changeColor(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void changeColor(int[][] image, int i, int j, int prevColor, int newColor){
        if(i<0 || i>image.length-1 || j<0 || j>image[i].length-1 || image[i][j]!=prevColor){
            return;
        }
        image[i][j]=newColor;
        changeColor(image, i+1, j, prevColor, newColor);
        changeColor(image, i, j+1, prevColor, newColor);
        changeColor(image, i-1, j, prevColor, newColor);
        changeColor(image, i, j-1, prevColor, newColor);
    }
}
