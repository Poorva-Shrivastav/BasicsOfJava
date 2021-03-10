public class BubbleSort {
    public static boolean bubbleSort(int arr[], int n){
        boolean flag;
        for(int i=0; i<n; i++){
            flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    //swapping makes sort unstable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
                if(flag = false){
                    break;
                }
            }

        }
        return false;

    }

    public static void main(String [] args){
        int n = 5;
        int arr [] = {4, 5, 3, 1, 2};
        bubbleSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
