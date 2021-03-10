import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BooleanMatrix {
    public static void main(String[] args){
   /*   BufferedReader rd  = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(rd.readLine());
        while(test-- >0){
            String str[] = rd.readLine().split(" ");
            int rows = Integer.parseInt(str[0]);
            int cols = Integer.parseInt(str[1]);
            int arr[][] = new int[rows][cols];
            for(int r=0; r<rows; r++){
                String str1[] = rd.readLine().split(" ");
                for(int c=0; c<cols; c++){
                    arr[r][c] = Integer.parseInt(str1[c])
                }
            }
    */
            int rows = 5;
            int cols = 4;
            int arr[][] = {{1, 0, 0, 0,},
                    {0, 0, 0, 0},
                    {0, 1, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 1}};

            for(int r=0; r<rows; r++){
                for(int c=0; c<cols; c++){
                    if(arr[r][c] == 1){
                        arr[r][0] = 1;
                    }
                }
            }
            for(int r=0; r<rows; r++){
                if(arr[r][0] == 1){
                    for(int c=0; c<cols; c++){
                        arr[r][c] = 1;
                    }
                }
            }
            for(int r=0; r<rows; r++){
                for(int c=0; c<cols; c++){
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }

//        }

    }
}
