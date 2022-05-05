package Arrays.Easy;

import java.util.Scanner;

public class MaximumAndMinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Pair pair = minMax(arr, size);
        System.out.println("Minimum element of given array is " + pair.min);
        System.out.println("Maximum element of given array is " + pair.max);
    }

    private static Pair minMax(int[] arr, int n) {
        Pair pair = new Pair();
        if (n == 0) {
            pair.max = 0;
            pair.min = 0;
            return pair;
        }
        if (n == 1) {
            pair.max = arr[0];
            pair.min = arr[0];
            return pair;
        }
        if (arr[0] > arr[1]) {
            pair.min = arr[1];
            pair.max = arr[0];
        } else {
            pair.min = arr[0];
            pair.max = arr[1];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] < pair.min) {
                pair.min = arr[i];
            } else if (arr[i] > pair.max) {
                pair.max = arr[i];

            }
        }
        return pair;


    }

    static class Pair {
        int min;
        int max;


    }

}
