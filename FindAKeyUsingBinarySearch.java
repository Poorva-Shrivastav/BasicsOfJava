public class FindAKeyUsingBinarySearch {

    public static int findK(int n, int[] arr, int key){
        int start = 0; //index value
        int end = n-1; //index value
        if(start>end){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(n==1){//if there's only 1 element
                key = n;
                return mid;
            }
            if(arr[mid] == key){
//                System.out.println(mid);
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else{ //arr[mid] < key
                start = mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int n= 5;
        int arr[] = {1, 2, 3, 4, 5};
        int key = 5;
        System.out.println(findK(n, arr, key));
    }
}
