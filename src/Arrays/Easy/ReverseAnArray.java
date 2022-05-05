package Arrays.Easy;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=  new int[size];
        System.out.println("Enter " + size + "elements for array: ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        printArray(arr,size);
        reverseArray(arr,0,size-1);
        System.out.println("Reversed array");
        printArray(arr,size);
    }

    private static void reverseArray(int[] arr, int began, int end) {
        if (began>=end)
            return;
        swap(arr,began,end);
        reverseArray(arr,began+1,end-1);
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    private static void printArray(int[] arr,int n){
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[n-1]+".");
    }
}
