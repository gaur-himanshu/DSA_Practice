package Arrays.Medium;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum profit will be: " + maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<=1)
            return 0;
        if (prices.length==2){
            if (prices[0]<prices[1])
                return prices[0]-prices[1];
            else
                return 0;
        }
        int min=Integer.MAX_VALUE;
        int diff=0;
        int res=0;
        for (int i = 0; i < prices.length; i++) {
            if (min>prices[i])
                min=prices[i];
            diff=prices[i]-min;
            if (diff>res)
                res=diff;
        }
        return res;
    }
}
