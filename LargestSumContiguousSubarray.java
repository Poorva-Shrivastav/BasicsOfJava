public class LargestSumContiguousSubarray {
    public static void main(String [] args){
        //Solved using Kadane's Algo
        int n = 6;
        int arr[] = {4, -7, -2, 9, 8, -3};
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<n; i++) {
            currSum = currSum + arr[i];
            if(maxSum < currSum) {
                maxSum = currSum;
            } else if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
