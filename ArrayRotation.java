import java.util.Scanner;

public class ArrayRotation {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = 8;//scn.nextInt();
        int k = 4; //rotate 4 times // scn.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; //new int[n];
        for (int i = 0; i < k; i++) {
            int first = arr[0]; //stores value of 0th index in a variable first
            for (int j = 1; j < n; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = first;
        }
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
