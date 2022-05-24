package Arrays.Medium;

import java.util.Scanner;

public class MinimumOperationToPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum merge operation needed to make an array palindrome: " + mimOp(arr,size));
    }

    private static int mimOp(int[] arr, int size) {
        if(size==0)
            return 0;
        if (size==1)
            return arr[0];
        int ans=0;
        for(int i=0,j=size-1;i<=j;) {
            if(arr[i]==arr[j]){
                i++;
                j--;
            } else if (arr[i]>arr[j]) {
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
            else {
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
        }
        return ans;
    }
}
