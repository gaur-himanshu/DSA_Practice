package Arrays.Hard;

import java.util.Scanner;

public class AllPossibleCombinationOfRElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element do you want: ");
        int r= sc.nextInt();
        combination(arr,size,r);
    }

    private static void combination(int[] arr, int size, int r) {
        int[] data = new int[r];
        combinationUtil(arr,size,r,0,data,0);
    }

    private static void combinationUtil(int[] arr, int size, int r, int index, int[] data, int i) {
        if (index==r){
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }
        if (i>=size){
            return;
        }
        data[index]=arr[i];
        combinationUtil(arr,size,r,index+1,data,i+1);
        combinationUtil(arr, size, r, index, data, i+1);
    }
}
