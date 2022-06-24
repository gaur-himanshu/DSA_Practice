package String.Medium;
import java.util.*;


public class NextPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= scanner.nextInt();
        System.out.println("Enter the " + n + " elements of array");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Next permutation of given array is: " + nextPermutation(n,arr));
    }

    private static List<Integer> nextPermutation(int n, int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        int i= arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]) {
            i--;
        }
        if (i>=0) {
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
        for (int j = 0; j < arr.length; j++) {
            ls.add(arr[j]);
        }

        return ls;

    }

    private static void reverse(int[] arr, int i, int length) {
        while(i<length){
            swap(arr,i++,length--);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
