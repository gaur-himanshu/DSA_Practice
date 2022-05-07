package Arrays.Easy;

import java.util.Scanner;

public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Key: ");
        int key= sc.nextInt();
        int i = findIndex(arr,0,size-1,key);
        if (i!=-1)
            System.out.println("The index for given key is " + i);
        else
            System.out.println("Key is not in the given Array");
    }

    private static int findIndex(int[] arr, int low, int high, int key) {
        if (low>high)
            return -1;
        int mid=(low+high)/2;
        if (arr[mid]==key)
            return mid;
        if (arr[mid]>arr[low]){
            if (key<=arr[mid] && key>=arr[low])
                return findIndex(arr,low,mid-1,key);
            return findIndex(arr,mid+1,high,key);
        }
        if (key>=arr[mid] && key<=arr[high])
            return findIndex(arr,mid+1,high,key);
        return findIndex(arr,low,mid-1,key);

    }
}
