package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Members");
        int members = sc.nextInt();
        System.out.println("Minimum difference is: " + minDiff(arr, size, members));
    }

    private static int minDiff(int[] arr, int size, int members) {
        if (members > size)
            return -1;
        if (members == 0 || size == 0)
            return 0;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + members + -1 < size; i++) {
            int mindiff = arr[i + members - 1] - arr[i];
            if (mindiff < min)
                min = mindiff;
        }
        return min;

    }
}
