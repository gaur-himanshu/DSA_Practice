package Arrays.Medium;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("which position largest element you want to find: ");
        int k= sc.nextInt();
        System.out.print(k+"th largest element in given array is " + findKthLargest(arr,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length ; i++) {
            if (pq.peek()<nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();

    }
}
