class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        
        int max = 0;

        int left = 0;
        int right = n - 1;

        while(left < right){
            if(heights[left] < heights[right]){
                int width = right - left;
                int area = heights[left] * width;
                max = Math.max(max, area);
                left++;
            }else{
                int width = right - left;
                int area = heights[right] * width;
                max = Math.max(max, area);
                right--;
            }
        }
        return max;
    }
}
