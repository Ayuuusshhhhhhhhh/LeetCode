class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int n = height.length;
        int r = n-1;
        int maxArea = 0;

        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int width = r - l;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if (height[l] < height[r]) {
                l++;  
            } 
            else 
            {
                r--;   
            }
        }

        return maxArea;
    }
}
