public class ReverseTheArray {
    public static void main(String []args){
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}