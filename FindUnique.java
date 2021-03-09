import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args)throws IOException {
//        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        int n = 5; //Integer.parseInt(rd.readLine());
//        String str[] = rd.readLine().split(" ");
//        int arr[] = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = Integer.parseInt(str[i]);
//        }
        int arr[] = {1, 3, 2, 1, 2};
        int freq = 0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                freq++;
                break;
            }
            i++;
        }
        if(freq==0) {
            System.out.println(arr[n-1]);  //the unique no is tha last no
        }
        else{
            System.out.println(freq); //unique no is somewhere in between
        }
     }

}
