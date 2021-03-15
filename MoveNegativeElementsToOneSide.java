public class MoveNegativeElementsToOneSide {
    public static void main(String[] args){
        int n = 10;
        int arr[]= {-12, 13, -15, 26, -23, 17, 46, -34, 18, -19};

        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
