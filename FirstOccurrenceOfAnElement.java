public class FirstOccurrenceOfAnElement {

    public static int firstOccurrence(int n, int[] arr, int key){
        int start = 0; //index value
        int end = n-1; //index value
        int result = 0; //to check occurrence of the key
        if(start>end){
            return -1;
        }
        if(n==1){//if there's only 1 element
            return n;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key){
                result = mid; //storing the index of mid(could be first or last
                end = mid-1;//to find first occurrence, we iterate on the left side if the array
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else { //if(arr[mid] < key)
                start = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int n= 5;
        int arr[] = {1, 2, 2, 4, 5};
        int key = 2;
        System.out.println(firstOccurrence(n, arr, key));
    }

}
