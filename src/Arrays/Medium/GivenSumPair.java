package Arrays.Medium;

import java.util.Scanner;

public class GivenSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum: ");
        int sum= sc.nextInt();
        System.out.println(isPairHas(arr,size,sum));
    }

    private static boolean isPairHas(int[] arr, int size, int sum) {
        int i=0;
        for ( i = 0; i <size-1 ; i++) {
            if (arr[i]>arr[i+1])
                break;
        }
        int l=(i+1)%size;
        int r=i;
        while(l!=r){
            if(arr[l]+arr[r]==sum)
                return true;
            if(arr[l]+arr[r]<sum)
                l=(l+1)%size;
            else
                r=(size+r-1)%size;
        }
        return false;
    }
}
