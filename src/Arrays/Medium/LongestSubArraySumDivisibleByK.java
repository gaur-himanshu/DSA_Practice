package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the number by which you want to divide: ");
        int k=sc.nextInt();

        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of Longest Subarray Sum Divisible by K");
        System.out.println(lengthOfLSA(arr,size,k));
    }

    private static int lengthOfLSA(int[] arr, int size, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=arr[i];
            int mod=((sum%k)+k)%k;
            if (mod==0){
                max=i+1;
            }
            if (!map.containsKey(mod)) {
                map.put(mod,i);
            }
            else {
                int sz=i-map.get(mod);
                max=Math.max(max,sz);
            }

        }
        return max;
    }
}
