package Arrays.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MosAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("How many queries do you want: ");
        int q= sc.nextInt();
        System.out.println();
        ArrayList<Query> query=new ArrayList<>();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter left element: ");
            int l= sc.nextInt();
            System.out.println("Enter right element: ");
            int r= sc.nextInt();
            query.add(i,new Query(l,r));
        }
        queryResult(arr,size,query,q);
    }

    private static void queryResult(int[] arr, int size, ArrayList<Query> query, int q) {
        int block=(int)Math.sqrt(size);
        Collections.sort(query, new Comparator<Query>() {
            @Override
            public int compare(Query o1, Query o2) {
                if (o1.L/block!=o2.L/block){
                    return (o1.L < o2.L ? -1 : 1);
                }
                return (o1.R < o2.R ? -1 : 1);
            }
        });
        int currL=0;
        int currR=0;
        int currSum=0;
        for (int i = 0; i < q; i++) {
            int l=query.get(i).L;
            int r=query.get(i).R;
            while (currL<l) {
                currSum -= arr[currL];
                currL++;
            }
            while (currL>l) {
                currSum+=arr[currL];
                currL--;
            }
            while (currR<=r) {
                currSum+=arr[currR];
                currR++;
            }
            while (currR>r+1) {
                currSum-=arr[currR];
                currR--;
            }
            System.out.println("Sum of [" + l + ", " + r + "] is " + currSum);
        }
    }

    public static class Query{
        int L;
        int R;

        public Query(int l, int r) {
            L = l;
            R = r;
        }
    }
}
