public class AlternateMatrixAddition {
    public static void main(String [] args) {
        int rows = 3;
        int cols = 3;
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int blackSum = 0;
        int whiteSUm = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    blackSum += arr[i][j];
                } else {
                    whiteSUm += arr[i][j];
                }
            }
        }
        System.out.println(blackSum);
        System.out.println(whiteSUm);
    }
}
