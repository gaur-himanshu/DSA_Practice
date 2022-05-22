package Arrays.Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class MergeOverLappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        Interval[] arr = new Interval[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = new Interval(sc.nextInt(), sc.nextInt());
        }
        mergeInterval(arr);
    }

    private static void mergeInterval(Interval[] arr) {
        if (arr.length <= 0)
            return;
        Stack<Interval> stack = new Stack<>();
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Interval top = stack.peek();
            if (top.end < arr[i].start)
                stack.push(arr[i]);
            else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(arr[i]);
            }
        }
        System.out.println("Merged intervals are: ");
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.print("[" + t.start + ", " + t.end + "] ");
        }


    }
}

class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
