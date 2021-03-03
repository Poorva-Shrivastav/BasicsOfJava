public class AgnosticSearch {
//    Agnostic search  - don't know if it is ascending or descending arr
    public static int agnosticSearchKey(int arr[], int n, int k){
        int start = 0;
        int end = n-1;

        if(start>end){
            return -1;
        }
        if(n==1){
            return n;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == k){ //common step for ascending and descending arr
                return mid;
            }
            if(arr[start]<arr[start+1]){
                if(arr[mid] > k){
                    end = mid-1;
                }
                else{ //arr[mid] < k
                    start = mid+1;
                }
            }
            else{ //arr[start]>arr[start+1] - checking if arr is descending

                // if descending
                if(arr[mid] > k){
                    start = mid+1;
                }
                else{ //arr[mid] < key
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int n= 5;
        int arr[] = {1, 3, 5, 7, 9};
        int k = 3;

        System.out.println(agnosticSearchKey(arr, n, k));
    }

}
