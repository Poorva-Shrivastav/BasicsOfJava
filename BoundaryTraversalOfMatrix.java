public class BoundaryTraversalOfMatrix {
    public static void main(String[] args){

        int rows = 4;
        int cols = 4;
        int arr [][] = {{1, 2, 3, 4},{5, 6, 7,8},{9, 10, 11, 12},{13, 14, 15, 16}};
        if(rows == 0){
            System.out.print(arr[0][cols] + " ");
        }
        else if(cols == 0){
            System.out.print(arr[rows][0] + " ");
        }
        else {
            int r = 0;
            int c = 0;
            while (c < cols) {
                System.out.print(arr[r][c] + " ");
                c++;
            }
            c--;
            r++;

            while (r < rows) {
                System.out.print(arr[r][c] + " ");
                r++;
            }
            r--;
            c--;

            while (c >= 0) {
                System.out.print(arr[r][c] + " ");
                c--;
            }
            c++;
            r--;
            while (r > 0) {
                System.out.print(arr[r][c] + " ");
                r--;
            }

        }

    }
}
