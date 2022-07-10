package TwoDArrays.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDiagonally {
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
        printDiagonally(arr,n,m);
    }

    private static void printDiagonally(int[][] arr, int n, int m) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(n+m-1);
        for (int i = 0; i < n + m - 1; i++) {
            ar.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                (ar.get(i+j)).add(arr[i][j]);
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j <ar.get(i).size(); j++) {
                System.out.print(ar.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
