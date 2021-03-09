import java.util.Scanner;

public class fundamentalsOfJava {
    public static void main(String[] args) {
/*
Q.Given the number of the month, your task is to calculate the number of days present in the particular month.

        int n = 4;
        if(n==1 ||n==3 ||n==5|| n==7 ||n==8 ||n==10||n==12){
            System.out.println(31);
        }
        else if(n==4 ||n==6 ||n==9||n==11){
            System.out.println(30);
        }
        else if(n==2){
            System.out.println(28);
        }
        else{
            System.out.println("Please enter a number between 1 to 12");
        }


//        Q. Compound interest
        int p = 100;
        int r = 1;
        int t = 2;

        double ci = p * Math.pow((1 + r/100.0), t)-p;
        System.out.printf("%.2f", ci);


//Q. Sum of natural numbers
        int n = 5;
        System.out.print(recur(n));
    }
    static int recur(int n){ //solved using recursion
        if(n==0){
            return 0;
        }
        int result = n + recur(n-1);
        return result;
        }


//Q. Armstrong no find and count
      int n = 500;
      int count = 0;
      for(int i=1; i<n; i++){
          int originalNum = i;
          int result = 0;

          while(originalNum != 0){
              int remainder = originalNum%10;
              result += remainder * remainder * remainder;

              originalNum = originalNum/10;
          }
          if(result == i){
              count = count+1;
              System.out.println(i);
          }
      }
        System.out.println(count);


Q.Compute power
                int n = 2; int p = 5;
                int power = 1;
                power = (int)Math.pow(2, 5);
                System.out.println(power);


Q. Average marks;

//        Scanner scn = new Scanner(System.in);
        int n = 4; //scn.nextInt();
        int arr[] = {1, 2, 3, 4};//new int[n];
        int marksSum = 0;
        int average = 0;
//        for(int i=0; i<n; i++){
//            arr[i] = scn.nextInt();
//        }
        for(int i=0; i<n; i++) {
            marksSum = marksSum + arr[i];
        }
        System.out.println(marksSum/n);


 Q . Fibonacci numbers
        int n = 5;
        System.out.println(fibonacci(n));

    }
        static int fibonacci(int n){

        if(n==1 || n==0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);



//Q. Given an integer n, For each i (1<=i<=n) if i is even print "even" else print "odd".
        int n = 10;

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                System.out.println(i + " even");
            }
            else{
                System.out.println(i + " odd");
            }


        }

//Q.Odd sum - sum of odd numbers present in an array
        int n = 4;
        int arr[] = {1, 2, 3, 5};
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);


Q. Find sum and mean
        int n = 5;
        int arr[] = {1, 2, 19, 28, 5};
        int sum = 0;
        for(int i=0; i<n; i++){
                sum = sum+arr[i];
        }
        System.out.println(sum);

        int mean = (int)Math.floor(sum/n);
        System.out.println(mean);



Q.  - Count multiples of N (between 1 to 100)

        int n = 3;
        int count = 0;
        for(int i=1; i<=100; i++){
            if(i%n == 0){
                count++;
            }
        }
        System.out.println(count);
*/
    }
}
