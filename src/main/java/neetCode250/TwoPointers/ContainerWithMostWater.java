package neetCode250.TwoPointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] heights) {
        int maxContainer = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r){
            int height = Math.min(heights[l], heights[r]);
            int width = r - l;
            int area = height * width;

            maxContainer = Math.max(area, maxContainer);

            if (heights[l] <= heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxContainer;
    }

    public static void main(String[] args) {
        //int[] heights = {2,2};
        int[] heights = {1,7,2,5,4,7,3,6};
        int result = ContainerWithMostWater.maxArea(heights);
        System.out.println("Maximum amount of water a container can store: " + result);
    }
}
