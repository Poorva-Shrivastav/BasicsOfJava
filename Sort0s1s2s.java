public class Sort0s1s2s {
    public static void main(String[] args){

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
        int n = 5;
        int arr[] = {0, 2, 1, 2, 0};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int i=0;
        for(i=0;i<n; i++){
            if(arr[i] == 0){
                count0++;
            }
            if(arr[i] == 1){
                count1++;
            }
            if(arr[i] == 2){
                count2++;
            }
        }
        for (i = 0; i < count0; i++) {
            arr[i] = 0;
//            System.out.print(arr[i] + " ");
        }
        for (i = count0; i < count0+count1; i++) {
            arr[i] = 1;
//            System.out.print(arr[i] + " ");
        }
        for (i = count0+count1; i < n; i++) {
            arr[i] = 2;
//            System.out.print(arr[i] + " ");
        }
        for (i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


