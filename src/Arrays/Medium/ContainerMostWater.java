package Arrays.Medium;

import java.util.Scanner;

public class ContainerMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum water can be contained: "+maxArea(arr));
    }

    private static int maxArea(int[] height) {

        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }
        int r = height.length - 1;
        int l = 0;
        int res = 0;
        while (l <= r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[r] > height[l])
                l++;
            else
                r--;
        }
        return res;
    }
}
