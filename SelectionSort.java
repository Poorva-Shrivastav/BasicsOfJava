public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minEleIndx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minEleIndx]) {
                    minEleIndx = j;
                }
            }
            int key = arr[minEleIndx];
            for (int k = minEleIndx - 1; k >= i; k--) {
                arr[k + 1] = arr[k];
            }
            arr[i] = key;
        }
    }

    public static void main(String [] args){
        int n = 5;
        int arr[] = {7, 2, 5, 0, 1};
        selectionSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
