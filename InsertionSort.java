public class InsertionSort {
    public static void insertionSort(int arr[], int n){
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                    //shift
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //new key
        }
    }

    public static void main(String [] args){
        int n = 5;
        int arr[] = {9,2, 5, 7, 1};
        insertionSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
