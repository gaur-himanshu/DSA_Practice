package TwoDArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array;");
        int n= sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("zero setted in matrix");
        setZero(arr);
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void setZero(int[][] arr) {
        boolean[][] vis= new boolean[arr.length][arr[0].length];
        for (boolean[] a:vis) {
            Arrays.fill(a,false);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(vis[i][j]==false&&arr[i][j]==0){
                    setRCZero(arr,i,j,vis);
                }

            }
        }

    }

    private static void setRCZero(int[][] arr, int i, int j, boolean[][] vis) {
        for (int k = 0; k < arr.length; k++) {
            if(arr[k][j]!=0)
                vis[k][j]=true;
            arr[k][j]=0;
        }
        for (int k = 0; k < arr[0].length; k++) {
            if (arr[i][k]!=0)
                vis[i][k]=true;
            arr[i][k]=0;
        }
    }

}
