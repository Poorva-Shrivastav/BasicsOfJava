import java.util.Arrays;
import java.util.Collections;

public class KthMaxandMininArray {
    public static void main (String[] args) {
        int n = 5;
        int k = 2;
        int []arr= {4, 6, 7, 2, 9};
        int min = arr[0];
        int max = arr[0];

        //Sort the array first
        Arrays.sort(arr);
        System.out.println("Kth smallest element: " + arr[k-1]);
        System.out.println("Kth largest element: " + arr[n-k]);

        //or we can sort array in descending order
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i] + " ");

        }System.out.println();

        System.out.println("Kth smallest element: " + arr[n-k]);
        System.out.println("Kth largest element: " + arr[k-1]);

    }

    }
