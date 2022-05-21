package Arrays.Medium;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the limits: ");
        System.out.println("Enter left limits: ");
        int l=sc.nextInt();
        System.out.println("Enter right limit: ");
        int r= sc.nextInt();
        System.out.println("Enter which position smallest element you want to find: ");
        int element = sc.nextInt();

        System.out.println(kthSmallest(arr,l,r, element));
    }

    private static int kthSmallest(int[] arr, int l,int r, int element) {
        Queue<Integer> pq=new PriorityQueue<>();
        for (int i = l; i <=r ; i++) {
            pq.add(arr[i]);
            if (pq.size()>element)
                pq.poll();
        }
        return pq.peek();

    }
}
