package Arrays.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumberFormedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];

        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        System.out.println("Largest Number formed from Array " + largestNumber(arr));
        
    }

    private static String largestNumber(String[] arr) {
        Collections.sort(Arrays.asList(arr), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String XY=o1+o2;
                String YX=o2+o1;
                return XY.compareTo(YX)>0?-1:1;
            }
        });
        String t="";
        for (String a:arr) {
            t+=a;
        }
        return t;
    }
}
