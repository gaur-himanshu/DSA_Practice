package Arrays.Medium;

import java.util.Scanner;

public class SpaceOptimizatioBitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range: ");
        System.out.println("Enter start point: ");
        int a= sc.nextInt();
        System.out.println("Enter the end point");
        int b= sc.nextInt();
        fiveOrTwo(a,b);


    }
    public static void fiveOrTwo(int a,int b ) {
        int size=Math.abs(b-a);
        size=(int)Math.ceil((double)size/32);
        int[] arr= new int[size];
        for (int i = a; i <=b ; i++) {
            if(i%2==0||i%5==0) {
                setBit(arr,i-a);
            }
        }
        System.out.println("Multiples of 2 and 5: ");
        for (int i = a; i <=b ; i++) {
            if (checkBit(arr,i-a)) {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean checkBit(int[] arr, int i) {
        if ((arr[i>>5]&(1<<(i&31)))==0) {
            return false;
        }
        else {
            return true;
        }
    }

    private static void setBit(int[] arr, int i) {
        arr[i>>5]|=(1<<(i&31));
    }
}
