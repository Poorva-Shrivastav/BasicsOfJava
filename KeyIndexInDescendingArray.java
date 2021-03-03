public class KeyIndexInDescendingArray {
    public static int descendingArrayFindK(int n, int[] arr, int key){
        int start = 0;
        int end = n-1;
        if(start>end){
            return -1;
        }
        if(n==1){   //if there's only 1 element
            return n;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key){
//                System.out.println(mid);
                return mid;
            }
            //everything remains same just the below two conditions would differ from ascending array
            else if(arr[mid] >= key){
                start = mid+1;
            }
            else{ //arr[mid] < key
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int n= 5;
        int arr[] = {100, 70, 50, 40 , 20};
        int key = 40;

        System.out.println(descendingArrayFindK(n, arr, key));
    }

}
