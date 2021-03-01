public class MinimumAndMaximumInArray {
    public static void main (String[] args){
        int n = 5;
        int arr[] = {4, 6, 7, 2, 9};
        int min = arr[0];
        int max = arr[0];

		for(int i=0; i<n; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
		for(int i=0; i<n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
		System.out.println("Minimum element: " + min);
		System.out.println("Max element: " + max);

/*Brute force
     Arrays.sort(arr);
     System.out.println("Minimum element: " + arr[0]);
     System.out.println("Maximum element: " + arr[n-1]);
 */
}
}
